package builder;

public class BancoBradesco extends Banco{

    @Override
    public void construirCarteira(String carteira) {
        boleto.setCarteira( "006" );
    }


}
