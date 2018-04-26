package model.command;

public interface Command {
    public void execute(String nome, String endereco, String telefone, String email);
}
