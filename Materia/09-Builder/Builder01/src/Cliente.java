import builder.RoboParaEsportivo;
import builder.RoboParaPopular;
import builder.RoboParaPopularAnfibio;

public class Cliente {

	public static void main(String[] args) {

		Montadora m1 = new Montadora(new RoboParaEsportivo());
		m1.construir();
		System.out.println(m1.getCarro());
		
		Montadora m2 = new Montadora(new RoboParaPopular());
		m2.construir();
		System.out.println(m2.getCarro());
		
		Montadora m3 = new Montadora(new RoboParaPopularAnfibio());
		m3.construir();
		System.out.println(m3.getCarro());
		
	}

}
