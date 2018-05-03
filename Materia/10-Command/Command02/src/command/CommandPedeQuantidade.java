package command;

import java.util.Scanner;

public class CommandPedeQuantidade  implements Command{

    @Override
    public void execute() {
        System.out.println("Digite a quantidade");
//        int qtdade = new Scanner(System.in.).nextInt();
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void redo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
