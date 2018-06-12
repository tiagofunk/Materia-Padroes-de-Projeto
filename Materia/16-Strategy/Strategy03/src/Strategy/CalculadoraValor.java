package Strategy;

import java.util.List;
import loja.ItemVenda;

public interface CalculadoraValor {
    
    public double calcularValor(List<ItemVenda> lsitaItens);
    
}
