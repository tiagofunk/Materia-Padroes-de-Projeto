package controller;

import javax.swing.JOptionPane;
import model.builder.Agenda;
import model.builder.CadastroCompleto;
import model.builder.CadastroInternet;
import model.builder.CadastroTelefone;
import model.command.Command;
import model.command.CommandCadastro;

public class Controle {
    
    private Agenda agenda;
    
    CadastroCompleto cc = new CadastroCompleto();
    CadastroInternet ci = new CadastroInternet();
    
    Command comandos[] = { 
        new CommandCadastro( cc )
//        new CommandCadastro( new CadastroInternet() ),
//        new CommandCadastro( new CadastroTelefone() )
    };

    public void cadastrar( String nome, String endereco, String email, String telefone, char opcao ){
        switch (opcao) {
            case 'c':
                agenda = new Agenda( new CadastroCompleto() );
                break;
            case 'i':
                agenda = new Agenda( new CadastroInternet() );
                break;
            case 't':
                agenda = new Agenda( new CadastroTelefone() );
                break;
            default:
                break;
        }
        
//        agenda.construir( nome, endereco, email, telefone );
            cc.getPessoa();
        JOptionPane.showMessageDialog( null, cc.getPessoa().toString() );
    }
}
