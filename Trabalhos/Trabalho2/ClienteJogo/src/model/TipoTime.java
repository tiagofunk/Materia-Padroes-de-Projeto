package model;

public enum TipoTime {
    AMARELO("amarelo"),
    AZUL("azul");
    
    private String nome;

    private TipoTime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
