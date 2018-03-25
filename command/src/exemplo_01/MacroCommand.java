package exemplo_01;

public class MacroCommand implements Command {
	
	private Command listaCommands[];
	
	public MacroCommand(Command[] listaCommands) {
		super();
		this.listaCommands = listaCommands;
	}

	@Override
	public void execute() {
		for( Command com : listaCommands ) {
			com.execute();
		}
	}

	@Override
	public void undo() {
		for( Command com : listaCommands ) {
			com.undo();
		}
	}

}
