package exemplo_01;

public class LightsOnCommand implements Command {

	private Light light;
	
	public LightsOnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}

}
