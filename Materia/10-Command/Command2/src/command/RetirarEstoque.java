package command;

import model.Deposito;

public class RetirarEstoque implements Command{
    
    private Deposito deposito;
    private int qtd;

    public RetirarEstoque() {
        deposito = Deposito.getDeposito();
    }
    
    public RetirarEstoque( Deposito deposito ){
        this.deposito = deposito;
    }
    
    @Override
    public void setDeposito( Deposito d ){
        this.deposito = d;
    }

    @Override
    public void execute(int qtdade) {
        this.qtd = qtdade;
        deposito.remove( qtd );
        System.out.println("Removendo: " + qtdade);
    }

    @Override
    public void undo() {
        deposito.add( qtd );
        System.out.println("UNDO: Adicionado: " + qtd);
    }

    @Override
    public void redo() {
        deposito.remove( qtd );
        System.out.println("REDO: Removendo: " + qtd);
    }
    
}
