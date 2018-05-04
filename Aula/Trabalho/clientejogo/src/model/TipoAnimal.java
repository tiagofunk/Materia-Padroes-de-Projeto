package model;

public enum TipoAnimal {
    RATO(1, "rato"),
    GATO(2, "gato"),
    LOBO(3, "lobo"),
    CACHORRO(4, "cachorro"),
    LEOPARDO(5, "leopardo"),
    TIGRE(6, "tigre"),
    LEAO(7, "leao"),
    ELEFANTE(8, "elefante");
    
    private int valor;
    private String nome;
    
    TipoAnimal( int valor, String nome ){
        this.valor = valor;
        this.nome = nome;
    }
    
    public int getValor(){
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
