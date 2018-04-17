package builder;

import produto.Boleto;

public abstract class Banco {

    protected Boleto boleto;

    public Banco() {
        this.boleto = new Boleto();
    }

    public void construirCedente(String cedente) {
        boleto.setCedente(cedente);
    }

    public void construirCarteira(String carteira) {
        boleto.setCarteira(carteira);
    }

    public void construirNossoNumero(String nossoNumero) {
        boleto.setNossoNumero(nossoNumero);
    }

    public Boleto getBoleto() {
        return boleto;
    }

}
