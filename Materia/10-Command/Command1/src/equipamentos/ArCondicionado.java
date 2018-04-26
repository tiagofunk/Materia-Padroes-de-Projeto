package equipamentos;

public class ArCondicionado {

	private int temperatura = 22;
	
	public int getTemperatura() {
		return temperatura;
	}
	
	public void ligar() {
		System.out.println("Ar condicionado ligado : " + temperatura);
	}
	
	public void desligar() {
		System.out.println("Ar condicionado desligado");
	}
	
	public void aumentarTemperatura() {
		temperatura++;
		System.out.println("Temperatura : " + temperatura);
	}

	public void abaixarTemperatura() {
		temperatura--;
		System.out.println("Temperatura : " + temperatura);
	}
	
}
