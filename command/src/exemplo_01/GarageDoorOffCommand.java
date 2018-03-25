package exemplo_01;

public class GarageDoorOffCommand implements Command {
	private GarageDoor gd;
	
	public GarageDoorOffCommand(GarageDoor gd) {
		super();
		this.gd = gd;
	}

	@Override
	public void execute() {
		gd.off();
	}

	@Override
	public void undo() {
		gd.on();		
	}

}
