package loja;

import Strategy.CalculadoraValor;
import java.util.List;

public class ValorPorTotal implements CalculadoraValor{

    @Override
    public double calcularValor(List<ItemVenda> lsitaItens) {
        double valor = 0;
        for(ItemVenda item: lsitaItens){
            valor += item.getPrecoUnit() * item.getQtdade();
        }
        if( valor > 300 ){
            valor -= 20;
        }
        return valor;
    }
    
}
