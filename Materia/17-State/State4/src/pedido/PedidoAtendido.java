package pedido;

public class PedidoAtendido extends EstadoPedido{
    
    public PedidoAtendido(Pedido pedido) {
        super(pedido);
        System.out.println("Pedido " + pedido.getNumero() + " atendido");
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
