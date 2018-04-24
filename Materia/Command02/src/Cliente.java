
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

        Deposito d = new Deposito();
        Map<Integer, Class<? extends Command>> comandos = new HashMap<>();
        comandos.put(1, AdicionarEstoque.class);
        comandos.put(2, RetirarEstoque.class);

        Scanner s = new Scanner(System.in);

        do {
            System.out.println("Digite a opcao (1-Adicionar; 2-Remover; 3-Desfazer comando; 4-Refazer comando; 5-Sair)");

            int op = s.nextInt();
            if (op == 5) {
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
                        Class<? extends Command> commClass = comandos.get(op);
                        Command comm = commClass.newInstance();

                        System.out.println("Digite a quantidade");
                        int qtdade = s.nextInt();

                        ci.execute(comm, qtdade);
                }
            }
        } while (true);
    }

}
