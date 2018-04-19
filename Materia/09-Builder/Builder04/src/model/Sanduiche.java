package model;

public class Sanduiche {
    
    private TipoSanduiche tipo;

    public Sanduiche(TipoSanduiche tipo) {
        this.tipo = tipo;
    }

    public TipoSanduiche getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Sanduiche{" + "tipo=" + tipo + '}';
    }
}
