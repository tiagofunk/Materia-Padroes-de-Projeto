package pedido;

public class PedidoEmAnalise extends EstadoPedido{
    
    public PedidoEmAnalise(Pedido pedido) {
        super(pedido);
        System.out.println("Pedido " + pedido.getNumero() + " em análise");
    }
    
}
