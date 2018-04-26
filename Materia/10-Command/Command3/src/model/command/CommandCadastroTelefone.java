package model.command;

import model.builder.Agenda;
import model.builder.CadastroTelefone;

public class CommandCadastroTelefone implements Command{
    
    private Agenda agenda;
    
    public CommandCadastroTelefone( ){
        agenda = new Agenda( new CadastroTelefone() );
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
