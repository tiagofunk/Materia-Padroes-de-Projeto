package pedido;

public class PedidoPendente extends EstadoPedido{
    
    public PedidoPendente(Pedido pedido) {
        super(pedido);
        System.out.println("Pedido " + pedido.getNumero() + " pendente");
    }
    
}
