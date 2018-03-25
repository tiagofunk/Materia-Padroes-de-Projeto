package exemplo_01;

public class StereoOnCommand implements Command {
	private Stereo stereo;
	
	public StereoOnCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume( 11 );
	}

	@Override
	public void undo() {
		stereo.off();
	}

}
