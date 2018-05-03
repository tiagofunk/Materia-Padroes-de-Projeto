
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import command.AdicionarEstoque;
import command.Command;
import command.CommandInvoker;
import command.RetirarEstoque;
import model.Deposito;

public class Cliente {

    public static void main(String[] args) throws Exception {

        CommandInvoker ci = new CommandInvoker();
        Map<Integer, Command> comandos = new HashMap<>();
        Deposito d = new Deposito();
        comandos.put(1, new AdicionarEstoque( d ) );
        comandos.put(2, new RetirarEstoque( d ) );
        comandos.put(5, new RetirarEstoque( d ) );

        Scanner s = new Scanner(System.in);

        do {
            System.out.println(
                    "Digite a opcao (1-Adicionar; 2-Remover; 3-Desfazer comando;"+
                    "4-Refazer comando; 5-Ver quantidade; 6-Sair)"
            );

            int op = s.nextInt();
            if (op == 6) {
                return;
            }

            if (op >= 1 && op <= 5) {
                switch (op) {

                    case 3:
                        ci.undo();
                        break;

                    case 4:
                        ci.redo();
                        break;

                    default:
                        Command comm = comandos.get(op);

                        

                        ci.execute(comm, qtdade);
                }
            }
        } while (true);
    }

}
