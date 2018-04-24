package command;

public class CommandInvoker {

    private Command command;
    private int qtd;
    
    public void execute(Command comm, int qtdade) {
        this.command = comm;
        this.qtd = qtdade;
        comm.execute(qtdade);
    }

    public void undo() {
        this.command.undo();
    }

    public void redo() {
        this.command.redo();
    }

}
