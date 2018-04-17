package builder;

public class BancoCaixa extends Banco {
    
    @Override
    public void construirCedente(String cedente) {
        boleto.setCedente( cedente.toUpperCase() );
    }

   
}
