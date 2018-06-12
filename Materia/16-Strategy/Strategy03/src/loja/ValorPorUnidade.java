package loja;

import Strategy.CalculadoraValor;
import java.util.List;

public class ValorPorUnidade implements CalculadoraValor{

    @Override
    public double calcularValor(List<ItemVenda> lsitaItens) {
        double valor = 0;
        for(ItemVenda item: lsitaItens){
            valor += item.getPrecoUnit() * item.getQtdade();
        }
        return valor * 0.85;
    }
    
}
