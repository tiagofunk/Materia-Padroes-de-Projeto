package teste;

public class ControleRemoto {
	
	Command commadn;

	public ControleRemoto() {
	}

	public void setCommand( Command command ) {
		this.commadn = command;
	}
	
	public void pressionarBotao() {
		commadn.execute();
	}
}
