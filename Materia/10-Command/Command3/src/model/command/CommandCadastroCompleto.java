package model.command;

import model.builder.Agenda;
import model.builder.CadastroCompleto;

public class CommandCadastroCompleto implements Command {
    
    private Agenda agenda;
    
    public CommandCadastroCompleto( ){
        agenda = new Agenda( new CadastroCompleto() );
    }

    @Override
    public void execute(String nome, String endereco, String telefone, String email) {
        agenda.construir(nome, endereco, email, telefone);
    }

    @Override
    public Agenda getAgenda() {
        return agenda;
    }
    
}
