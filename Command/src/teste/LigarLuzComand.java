package teste;

public class LigarLuzComand implements Command {
	
	private Luz luz;

	public LigarLuzComand( Luz luz ) {
		this.luz = luz;
	}

	@Override
	public void execute() {
		luz.on();
	}

	@Override
	public void undo() {
		luz.off();	
	}

}
