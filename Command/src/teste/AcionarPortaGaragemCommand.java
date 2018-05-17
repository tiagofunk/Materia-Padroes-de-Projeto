package teste;

public class AcionarPortaGaragemCommand implements Command {

	private PortaGaragem portaGaragem;
	
	public AcionarPortaGaragemCommand( PortaGaragem portaGaragem ) {
		this.portaGaragem = portaGaragem;
	}

	@Override
	public void execute() {
		portaGaragem.up();
	}

	@Override
	public void undo() {
		portaGaragem.down();
	}

}
