package pedido;

public abstract class EstadoPedido {
    
    protected Pedido pedido;
    
    public EstadoPedido(Pedido pedido){
        this.pedido = pedido;
    }
    
}
