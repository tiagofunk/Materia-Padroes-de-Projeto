package model;

public class Bebida {
    
    private TipoBebida tipo;

    public Bebida(TipoBebida tipo) {
        this.tipo = tipo;
    }

    public TipoBebida getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Bebida{" + "tipo=" + tipo + '}';
    }
}
