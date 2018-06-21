package pedido;

public abstract class EstadoPedido {
    
    protected Pedido pedido;
    
    public EstadoPedido(Pedido pedido){
        this.pedido = pedido;
    }
    
    public abstract void analisar() throws Exception;

    public abstract void suspender() throws Exception;

    public abstract void retomar() throws Exception;

    public abstract void cancelar() throws Exception;

    public abstract void aprovar() throws Exception;

    public abstract void atender() throws Exception;
    
}
