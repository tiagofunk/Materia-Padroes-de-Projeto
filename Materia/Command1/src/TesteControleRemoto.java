
import comandos.arcondicionado.AbaixarTemperaturaArCondicionado;
import comandos.arcondicionado.AumentarTemperaturaArCondicionado;
import comandos.arcondicionado.DesligarArCondicionado;
import comandos.arcondicionado.LigarArCondicionado;
import comandos.arcondicionado.MeuPreferidoArCondicionado;
import comandos.lampada.DesligarLampada;
import comandos.lampada.LigarLampada;
import controleremoto.ControleRemoto;
import equipamentos.ArCondicionado;
import equipamentos.Lampada;

public class TesteControleRemoto {

    public static void main(String[] args) {

        Lampada sala = new Lampada("Sala");
        Lampada cozinha = new Lampada("Cozinha");

        LigarLampada ligarSala = new LigarLampada(sala);
        LigarLampada ligarCozinha = new LigarLampada(cozinha);

        DesligarLampada desligarSala = new DesligarLampada(sala);
        DesligarLampada desligarCozinha = new DesligarLampada(cozinha);

        ArCondicionado ar = new ArCondicionado();
        LigarArCondicionado ligarAr = new LigarArCondicionado(ar);
        DesligarArCondicionado desligarAr = new DesligarArCondicionado(ar);
        AumentarTemperaturaArCondicionado aumentarAr = new AumentarTemperaturaArCondicionado(ar);
        AbaixarTemperaturaArCondicionado abaixarAr = new AbaixarTemperaturaArCondicionado(ar);
        MeuPreferidoArCondicionado mpac = new MeuPreferidoArCondicionado(ar);

        ControleRemoto controle = new ControleRemoto();

        controle.configurar(ControleRemoto.BOTAO_1, ControleRemoto.BOTAO_CIMA, ligarSala);
        controle.configurar(ControleRemoto.BOTAO_1, ControleRemoto.BOTAO_BAIXO, desligarSala);

        controle.configurar(ControleRemoto.BOTAO_2, ControleRemoto.BOTAO_CIMA, ligarCozinha);
        controle.configurar(ControleRemoto.BOTAO_2, ControleRemoto.BOTAO_BAIXO, desligarCozinha);

        controle.configurar(ControleRemoto.BOTAO_3, ControleRemoto.BOTAO_CIMA, ligarAr);
        controle.configurar(ControleRemoto.BOTAO_3, ControleRemoto.BOTAO_BAIXO, desligarAr);
        controle.configurar(ControleRemoto.BOTAO_3, ControleRemoto.BOTAO_ESQ, abaixarAr);
        controle.configurar(ControleRemoto.BOTAO_3, ControleRemoto.BOTAO_DIR, aumentarAr);

        controle.configurar(ControleRemoto.BOTAO_4, ControleRemoto.BOTAO_CENTRAL, mpac);

        controle.pressBotao(ControleRemoto.BOTAO_1);
        controle.pressBotao(ControleRemoto.BOTAO_CIMA);
        controle.pressBotao(ControleRemoto.BOTAO_BAIXO);
        controle.pressBotao(ControleRemoto.BOTAO_ESQ);

        controle.pressBotao(ControleRemoto.BOTAO_2);
        controle.pressBotao(ControleRemoto.BOTAO_CIMA);
        controle.pressBotao(ControleRemoto.BOTAO_CENTRAL);

        controle.pressBotao(ControleRemoto.BOTAO_3);
        controle.pressBotao(ControleRemoto.BOTAO_CIMA);
        controle.pressBotao(ControleRemoto.BOTAO_ESQ);
        controle.pressBotao(ControleRemoto.BOTAO_ESQ);

        controle.pressBotao(ControleRemoto.BOTAO_4);
        controle.pressBotao(ControleRemoto.BOTAO_CENTRAL);

        System.out.println(" ----- Desfazer ----- ");
        controle.desfazer();
        controle.desfazer();
        controle.desfazer();

        System.out.println(" ----- Refazer ----- ");
        controle.refazer();
        controle.refazer();

        System.out.println(" ----- Desfazer ----- ");
        controle.desfazerTudo();

        System.out.println(" ----- Refazer ----- ");
        controle.refazerTudo();

    }

}
