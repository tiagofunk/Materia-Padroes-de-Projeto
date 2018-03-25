package exemplo_01;

public class Executar {
	
	public static void main(String[] args) {
		RemoteControl src = new RemoteControl();
		
		Light l = new Light();
		src.setCommand(0, new LightsOnCommand( l ), new LightsOffCommand( l ) );
		src.onButtonWasPushed( 0 );
		
		Stereo e = new Stereo();
		src.setCommand( 1 , new StereoOnCommand( e ), new StereoOffCommand( e ) );
		src.onButtonWasPushed( 1 );
		
		GarageDoor gd = new GarageDoor();
		src.setCommand( 2, new GarageDoorOnCommand( gd ), new GarageDoorOffCommand( gd ) );
		src.onButtonWasPushed( 2 );
		
		src.offButtonWasPushed( 2 );
		
		src.undoButtonWasPressed();
		src.undoButtonWasPressed();
	}
}
