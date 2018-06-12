package loja;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	private List<ItemVenda> itens = new ArrayList<>();
	
	public void add(ItemVenda item) {
		itens.add(item);
	}
	
	public double pagar() {
		double res = 0;
		for (ItemVenda item:itens)
			res += item.getPrecoUnit()*item.getQtdade();
		return res;
	}
}
