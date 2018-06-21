package pedido;

public class Pedido {
    
    private int numero;
    private EstadoPedido estadoPedido;

    public Pedido(int numero) {
        this.numero = numero;
        estadoPedido = new PedidoRegistrado(this);
    }
    
    public void setEstado(EstadoPedido estado) {
        this.estadoPedido = estado;
    }
    
    public void analisar() throws Exception {
        estadoPedido.analisar();
    }

    public void suspender() throws Exception {
        estadoPedido.suspender();
    }

    public void retomar() throws Exception {
        estadoPedido.retomar();
    }

    public void cancelar() throws Exception {
        estadoPedido.cancelar();
    }

    public void aprovar() throws Exception {
        estadoPedido.aprovar();
    }

    public void atender() throws Exception {
        estadoPedido.atender();
    }

    public int getNumero() {
        return numero;
    }
}
