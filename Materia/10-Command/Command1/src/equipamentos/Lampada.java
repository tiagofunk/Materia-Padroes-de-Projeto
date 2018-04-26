package equipamentos;

public class Lampada {

	private String comodo;

	public Lampada(String comodo) {
		this.comodo = comodo;
	}
	
	public void acender() {
		System.out.println(comodo + " -> aceso" );
	}

	public void apagar() {
		System.out.println(comodo + " -> apagado" );
	}
}
