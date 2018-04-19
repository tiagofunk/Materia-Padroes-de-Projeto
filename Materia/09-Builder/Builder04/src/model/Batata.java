package model;

public class Batata {
    
    private TipoBatata tipo;

    public Batata(TipoBatata tipo) {
        this.tipo = tipo;
    }

    public TipoBatata getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Batata{" + "tipo=" + tipo + '}';
    }

    
    
}
