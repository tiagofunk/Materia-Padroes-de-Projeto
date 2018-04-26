package model.command;

import model.builder.Agenda;
import model.builder.CadastroInternet;

public class CommandCadastroInternet implements Command{
    
    private Agenda agenda;
    
    public CommandCadastroInternet( ){
        agenda = new Agenda( new CadastroInternet() );
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
