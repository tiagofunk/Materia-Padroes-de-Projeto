package cartao;

public class CartaoBloqueado extends CartaoEstado{
    
    private Cartao cartao;
    
    public CartaoBloqueado(Cartao cartao){
        this.cartao = cartao;
    }

    @Override
    public void entrarPin(String pin) throws Exception {
        throw new Exception("Cartão validado");
    }

    @Override
    public void fazerPagamento() throws Exception {
        throw new Exception("Cartão validado");
    }
    
    @Override
    public String toString() {
        return "CartaoBloqueado";
    }
}
