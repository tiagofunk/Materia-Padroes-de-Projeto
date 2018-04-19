package model;

public class Brinquedo {
    
    private TipoBrinquedo tipo;

    public Brinquedo(TipoBrinquedo tipo) {
        this.tipo = tipo;
    }

    public TipoBrinquedo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Brinquedo{" + "tipo=" + tipo + '}';
    }
    
}
