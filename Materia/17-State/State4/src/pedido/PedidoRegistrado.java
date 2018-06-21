package pedido;

public class PedidoRegistrado extends EstadoPedido{

    public PedidoRegistrado(Pedido pedido) {
        super(pedido);
        System.out.println("Pedido " + pedido.getNumero() + " registrado");
    }
    
}
