package pedido;

public class PedidoAprovado extends EstadoPedido{
    
    public PedidoAprovado(Pedido pedido) {
        super(pedido);
        System.out.println("Pedido " + pedido.getNumero() + " aprovado");
    }
    
}
