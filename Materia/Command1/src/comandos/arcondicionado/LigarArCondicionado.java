package comandos.arcondicionado;

import equipamentos.ArCondicionado;

public class LigarArCondicionado implements ComandoArCondicionado {

	private ArCondicionado ar;

	public LigarArCondicionado(ArCondicionado ar) {
		this.ar = ar;
	}
	
	@Override
	public void execute() {
		ar.ligar();
	}
	
	@Override
	public void undo() {
		ar.desligar();
	}
	
	@Override
	public String toString() {
		return "Ligar";
	}

}
