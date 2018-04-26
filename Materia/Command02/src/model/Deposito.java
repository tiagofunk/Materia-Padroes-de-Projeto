package model;

public class Deposito {
    
    private static Deposito d = new Deposito();
    
    public static Deposito getDeposito(){
        return d;
    }
    
    private Deposito(){
        
    }

    private int quantidade;

    public void add(int qtdade) {
        this.quantidade += qtdade;
        System.out.println("Quantidade: " + getQuantidade() );
    }

    public void remove(int qtdade) {
        this.quantidade -= qtdade;
        System.out.println("Quantidade: " + getQuantidade() );
    }

    public int getQuantidade() {
        return quantidade;
    }

}
