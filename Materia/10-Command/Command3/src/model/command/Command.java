package model.command;

import model.builder.Agenda;

public interface Command {
    public void execute(String nome, String endereco, String telefone, String email);
    public Agenda getAgenda();
}
