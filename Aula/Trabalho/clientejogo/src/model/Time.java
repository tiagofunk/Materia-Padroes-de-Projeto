package model;

public enum Time {
    AMARELO("amarelo"),
    AZUL("azul"),
    NENHUM("nenhum");
    
    private String nome;

    private Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
