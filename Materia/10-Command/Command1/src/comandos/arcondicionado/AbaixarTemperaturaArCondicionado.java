package comandos.arcondicionado;

import equipamentos.ArCondicionado;

public class AbaixarTemperaturaArCondicionado implements ComandoArCondicionado {

	private ArCondicionado ar;

	public AbaixarTemperaturaArCondicionado(ArCondicionado ar) {
		this.ar = ar;
	}
	
	@Override
	public void execute() {
		ar.abaixarTemperatura();
	}
	
	@Override
	public void undo() {
		ar.aumentarTemperatura();
	}
	
	@Override
	public String toString() {
		return "Abaixar";
	}


}
