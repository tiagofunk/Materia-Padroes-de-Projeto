package exemplo_01;

public class GarageDoorOnCommand implements Command {

	private GarageDoor gd;
	
	public GarageDoorOnCommand(GarageDoor gd) {
		super();
		this.gd = gd;
	}

	@Override
	public void execute() {
		gd.on();
	}

	@Override
	public void undo() {
		gd.off();
	}
	
}
