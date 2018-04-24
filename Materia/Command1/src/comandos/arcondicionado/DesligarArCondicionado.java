package comandos.arcondicionado;

import equipamentos.ArCondicionado;

public class DesligarArCondicionado implements ComandoArCondicionado {

	private ArCondicionado ar;

	public DesligarArCondicionado(ArCondicionado ar) {
		this.ar = ar;
	}
	
	@Override
	public void execute() {
		ar.desligar();
	}
	
	@Override
	public void undo() {
		ar.ligar();
	}
	
	@Override
	public String toString() {
		return "Desligar";
	}
}
