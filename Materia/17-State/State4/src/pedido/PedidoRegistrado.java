package pedido;

public class PedidoRegistrado extends EstadoPedido{

    public PedidoRegistrado(Pedido pedido) {
        super(pedido);
        System.out.println("Pedido " + pedido.getNumero() + " registrado");
    }

    @Override
    public void analisar() throws Exception {
        pedido.setEstado( new PedidoEmAnalise(pedido) );
    }

    @Override
    public void suspender() throws Exception {
        throw new Exception("Operação inválida !!");
    }

    @Override
    public void retomar() throws Exception {
        throw new Exception("Operação inválida !!");
    }

    @Override
    public void cancelar() throws Exception {
        throw new Exception("Operação inválida !!");
    }

    @Override
    public void aprovar() throws Exception {
        throw new Exception("Operação inválida !!");
    }

    @Override
    public void atender() throws Exception {
        throw new Exception("Operação inválida !!");
    }
    
}
