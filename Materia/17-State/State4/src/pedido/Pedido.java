package pedido;

public class Pedido {
    
    private int numero;
    private EstadoPedido estadoPedido;

    public void setEstado(EstadoPedido estado) {
        this.estadoPedido = estado;
    }

    public Pedido(int numero) {
        this.numero = numero;
        estadoPedido = new PedidoRegistrado(this);
    }

    public void analisar() throws Exception {
        estadoPedido = new PedidoEmAnalise(this);
    }

    public void suspender() throws Exception {
        estadoPedido = new PedidoPendente(this);
    }

    public void retomar() throws Exception {
        estadoPedido = new PedidoEmAnalise(this);
    }

    public void cancelar() throws Exception {
        estadoPedido = new PedidoCancelado(this);
    }

    public void aprovar() throws Exception {
        estadoPedido = new PedidoAprovado(this);
    }

    public void atender() throws Exception {
        estadoPedido = new PedidoAtendido(this);
    }

    public int getNumero() {
        return numero;
    }
}
