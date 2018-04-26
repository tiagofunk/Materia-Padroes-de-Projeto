package comandos;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Nada associado a esse botao");
	}

	@Override
	public void undo() {
		System.out.println("Nada a desfazer");
	}

	@Override
	public String toString() {
		return "Nada associado";
	}
}
