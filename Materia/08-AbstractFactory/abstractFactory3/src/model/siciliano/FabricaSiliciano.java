package model.siciliano;

import model.abstrato.FabricaPizza;
import model.abstrato.PizzaQuatroQueijos;
import model.abstrato.PizzaVegetariana;

public class FabricaSiliciano implements FabricaPizza {

	@Override
	public PizzaQuatroQueijos criarPizzaQuatroQueijos() {
		return new PizzaQuatroQueijosSiciliano();
	}

	@Override
	public PizzaVegetariana criarPizzaVegetariana() {
		return new PizzaVegetarianaSiliciano();
	}

}
