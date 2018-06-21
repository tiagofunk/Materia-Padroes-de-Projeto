package pedido;

public class PedidoEmAnalise extends EstadoPedido{
    
    public PedidoEmAnalise(Pedido pedido) {
        super(pedido);
        System.out.println("Pedido " + pedido.getNumero() + " em análise");
    }

    @Override
    public void analisar() throws Exception {
        throw new Exception("Operação inválida !!");
    }

    @Override
    public void suspender() throws Exception {
        pedido.setEstado( new PedidoPendente(pedido) );
    }

    @Override
    public void retomar() throws Exception {
        throw new Exception("Operação inválida !!");
    }

    @Override
    public void cancelar() throws Exception {
        pedido.setEstado( new PedidoCancelado(pedido) );
    }

    @Override
    public void aprovar() throws Exception {
        pedido.setEstado( new PedidoAprovado(pedido) );
    }

    @Override
    public void atender() throws Exception {
        throw new Exception("Operação inválida !!");
    }
    
}
