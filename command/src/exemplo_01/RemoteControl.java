package exemplo_01;

import java.util.Arrays;

public class RemoteControl {
	
	private static final int NUMERO_SLOTS = 3;

	private Command[] onCommands;
	private Command[] offCommands;
	private Command undoCommand;
	
	public RemoteControl() {
		super();
		onCommands = new Command[ NUMERO_SLOTS ];
		offCommands = new Command[ NUMERO_SLOTS ];
	}
	
	public void setCommand( int slot, Command onCommand, Command offCommand ) {
		onCommands[ slot ] = onCommand;
		offCommands[ slot ] = offCommand;
	}
	
	public void onButtonWasPushed( int slot ) {
		Command com = onCommands[ slot ];
		if( com != null ) {
			com.execute();
			undoCommand = com;
		}
	}
	
	public void offButtonWasPushed( int slot ) {
		Command com = offCommands[ slot ];
		if( com != null ) {
			com.execute();
			undoCommand = com;
		}
	}
	
	public void undoButtonWasPressed() {
		undoCommand.undo();
	}

	@Override
	public String toString() {
		return "RemoteControl [onCommands=" + Arrays.toString(onCommands) + ", offCommands="
				+ Arrays.toString(offCommands) + "]";
	}
	
	
	
}
