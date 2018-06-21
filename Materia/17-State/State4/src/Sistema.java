
import pedido.Pedido;

public class Sistema {

    public static void main(String[] args) throws Exception {

        Pedido pedido = new Pedido(1);
        try {
            pedido.aprovar();
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        pedido.analisar();

        pedido.suspender();
        pedido.retomar();

        pedido.aprovar();
        pedido.cancelar();

        try {
            pedido.atender();
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }

        pedido = new Pedido(2);
        pedido.analisar();
        pedido.aprovar();
        pedido.cancelar();
        try {
            pedido.atender();
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }

        pedido = new Pedido(3);
        pedido.analisar();
        pedido.aprovar();
        pedido.atender();

    }

}
