package command;

public interface Command {
	
	void execute(int qtdade);
	
	void undo();
	
	void redo();

}
