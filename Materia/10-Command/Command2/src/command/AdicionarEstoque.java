package command;

import model.Deposito;

public class AdicionarEstoque implements Command {

    private Deposito deposito;
    private int qtdade;
    
    public AdicionarEstoque(Deposito deposito) {
        this.deposito = deposito;
    }

    @Override
    public void execute(int qtdade) {
        this.qtdade = qtdade;
        deposito.add(qtdade);
        System.out.println("Adicionando: " + qtdade);
    }

    @Override
    public void undo() {
        deposito.remove(qtdade);
        System.out.println("UNDO: removendo: " + qtdade);
    }

    @Override
    public void redo() {
        deposito.add(qtdade);
        System.out.println("REDO: adicionando: " + qtdade);
    }

}
