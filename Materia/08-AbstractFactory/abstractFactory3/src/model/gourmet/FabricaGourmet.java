package model.gourmet;

import model.abstrato.FabricaPizza;
import model.abstrato.PizzaQuatroQueijos;
import model.abstrato.PizzaVegetariana;

public class FabricaGourmet implements FabricaPizza {

	@Override
	public PizzaQuatroQueijos criarPizzaQuatroQueijos() {
		return new PizzaQuatroQueijoGourmet();
	}

	@Override
	public PizzaVegetariana criarPizzaVegetariana() {
		return new PizzaVegetarianaGourmet();
	}

}
