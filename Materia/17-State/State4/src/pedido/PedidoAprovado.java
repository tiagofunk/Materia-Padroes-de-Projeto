package pedido;

public class PedidoAprovado extends EstadoPedido{
    
    public PedidoAprovado(Pedido pedido) {
        super(pedido);
        System.out.println("Pedido " + pedido.getNumero() + " aprovado");
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
       throw new Exception("Operação inválida !!");
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
        pedido.setEstado( new PedidoAtendido(pedido) );
    }
    
}
