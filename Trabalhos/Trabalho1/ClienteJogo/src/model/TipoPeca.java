package model;

public enum TipoPeca {
    GRAMA("grama"),
    AGUA("agua"),
    ARMADILHA("armadilha"),
    TOCA("buraco");
    
    private String nome;

    private TipoPeca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
