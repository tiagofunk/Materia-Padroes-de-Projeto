package pedido;

public class PedidoPendente extends EstadoPedido{
    
    public PedidoPendente(Pedido pedido) {
        super(pedido);
        System.out.println("Pedido " + pedido.getNumero() + " pendente");
    }

    @Override
    public void analisar() throws Exception {
        throw new Exception("Operação inválida !!");
    }

    @Override
    public void suspender() throws Exception {
        throw new Exception("Operação inválida !!");
    }

    @Override
    public void retomar() throws Exception {
        pedido.setEstado( new PedidoEmAnalise(pedido) );
    }

    @Override
    public void cancelar() throws Exception {
        pedido.setEstado( new PedidoCancelado(pedido) );
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
