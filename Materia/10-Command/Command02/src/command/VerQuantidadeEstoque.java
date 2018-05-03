package command;

import model.Deposito;

public class VerQuantidadeEstoque implements Command{
    
    private Deposito deposito;

    public VerQuantidadeEstoque(Deposito deposito) {
        this.deposito = deposito;
    }

    @Override
    public void execute(int qtdade) {
        System.out.println( deposito.getQuantidade() );
    }

    @Override
    public void undo() {
    }

    @Override
    public void redo() {
    }
    
}
