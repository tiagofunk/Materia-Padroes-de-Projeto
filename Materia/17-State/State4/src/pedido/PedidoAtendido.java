package pedido;

public class PedidoAtendido extends EstadoPedido{
    
    public PedidoAtendido(Pedido pedido) {
        super(pedido);
        System.out.println("Pedido " + pedido.getNumero() + " atendido");
    }
    
}
