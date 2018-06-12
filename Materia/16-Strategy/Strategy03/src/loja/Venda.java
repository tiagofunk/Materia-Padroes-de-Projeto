package loja;

import Strategy.CalculadoraValor;
import java.util.ArrayList;
import java.util.List;

public class Venda {

    private List<ItemVenda> itens = new ArrayList<>();
    private CalculadoraValor calculadoraValor;
    
    public Venda(CalculadoraValor cv){
        calculadoraValor = cv;
    }

    public void add(ItemVenda item) {
        itens.add(item);
    }

    public double pagar() {
//        double res = 0;
//        for (ItemVenda item : itens) {
//            res += item.getPrecoUnit() * item.getQtdade();
//        }
        return calculadoraValor.calcularValor(itens);
    }
}
