package comandos.lampada;

import comandos.Command;
import equipamentos.Lampada;

public class LigarLampada implements Command {

	private Lampada lampada;

	public LigarLampada(Lampada lampada) {
		this.lampada = lampada;
	}
	
	@Override
	public void execute() {
		lampada.acender();
	}
	
	@Override
	public void undo() {
		lampada.apagar();
	}
	
	@Override
	public String toString() {
		return "Ligar";
	}
}
