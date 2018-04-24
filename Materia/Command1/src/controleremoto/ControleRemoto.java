package controleremoto;

import java.util.ArrayList;
import java.util.List;

import comandos.Command;
import comandos.NoCommand;

// a principio nao devem ter mais novos imports
public class ControleRemoto {

    public static final int BOTAO_1 = 1;
    public static final int BOTAO_2 = 2;
    public static final int BOTAO_3 = 3;
    public static final int BOTAO_4 = 4;
    public static final int BOTAO_5 = 5;
    public static final int BOTAO_6 = 6;
    public static final int BOTAO_7 = 7;
    public static final int BOTAO_8 = 8;
    public static final int BOTAO_9 = 9;

    public static final int BOTAO_CIMA = 10;
    public static final int BOTAO_BAIXO = 11;
    public static final int BOTAO_ESQ = 12;
    public static final int BOTAO_DIR = 13;
    public static final int BOTAO_CENTRAL = 14;

    // 9 bot�es para configurar equipamento e os 5 para controlar o equipamento
    private Command botoes[][] = new Command[9][5];

    public ControleRemoto() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                botoes[i][j] = new NoCommand();
            }
        }
    }

    public void configurar(int botao1_9, int botaoTeclasEspeciais, Command comando) {
        botoes[botao1_9 - 1][botaoTeclasEspeciais - 10] = comando;
    }

    private int equip = 0;
    private List<Command> comandosUndo = new ArrayList<>();
    private List<Command> comandosRedo = new ArrayList<>();

    public void pressBotao(int botao) {
        if (botao <= 9) {
            equip = botao - 1;
            //System.out.println("Selecionado Equip " + botao);
        } else {
            Command comm = botoes[equip][botao - 10];
            //System.out.println(comm);
            comm.execute();

            comandosUndo.add(comm);
        }
    }

    public void desfazer() {
        if (comandosUndo.size() > 0) {
            Command comm = comandosUndo.get(comandosUndo.size() - 1);
            comm.undo();
            comandosRedo.add(0, comm);
            comandosUndo.remove(comm);
        }
    }

    public void desfazerTudo() {
        for (int i = comandosUndo.size() - 1; i >= 0; i--) {
            comandosUndo.get(i).undo();
            comandosRedo.add(0, comandosUndo.get(i));
        }

        comandosUndo.clear();
    }

    public void refazer() {
        if (comandosRedo.size() > 0) {
            Command comm = comandosRedo.get(0);
            comm.execute();
            comandosUndo.add(comm);
            comandosRedo.remove(comm);
        }
    }

    public void refazerTudo() {
        for (int i = 0; i < comandosRedo.size(); i++) {
            comandosRedo.get(i).execute();
            comandosUndo.add(comandosRedo.get(i));
        }

        comandosRedo.clear();
    }

}
