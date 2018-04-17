
import builder.Banco;
import produto.Boleto;

// Director
public class GeradorBoleto {

    private Banco banco;

    public GeradorBoleto(Banco banco) {
        this.banco = banco;
    }

    public void construir(String cedente, String carteira, String nossoNumero) {
        banco.construirCedente(cedente);
        banco.construirCarteira(carteira);
        banco.construirNossoNumero(nossoNumero);
    }

    public Boleto getBoleto() {
        return banco.getBoleto();
    }
}
