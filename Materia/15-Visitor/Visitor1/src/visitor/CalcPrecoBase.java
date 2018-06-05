package visitor;

import pedido.ItemPedido;

public class CalcPrecoBase implements Visitor {

    @Override
    public void visit(ItemPedido itemPedido) {
        valor += itemPedido.getPcoUnitario() * itemPedido.getQtdade();
    }

    private double valor;

    public double getValor() {
        return valor;
    }
}
