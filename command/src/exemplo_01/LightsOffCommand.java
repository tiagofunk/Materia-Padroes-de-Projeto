package exemplo_01;

public class LightsOffCommand implements Command {
	Light light;
	
	public LightsOffCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

}
