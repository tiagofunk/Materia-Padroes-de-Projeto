package pedido;

public class PedidoCancelado extends EstadoPedido{
    
    public PedidoCancelado(Pedido pedido) {
        super(pedido);
        System.out.println("Pedido " + pedido.getNumero() + " cancelado");
    }
    
}
