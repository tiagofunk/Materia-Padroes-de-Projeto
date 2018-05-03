package model;

public class Deposito {
    
    private int quantidade;
     
    public Deposito(){
        
    }

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
