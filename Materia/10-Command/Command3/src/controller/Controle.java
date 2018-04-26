package controller;

import java.util.HashMap;
import javax.swing.JOptionPane;
import model.builder.Agenda;
import model.command.Command;
import model.command.CommandCadastroCompleto;
import model.command.CommandCadastroInternet;
import model.command.CommandCadastroTelefone;

public class Controle {
    
    private Agenda agenda;

    public void cadastrar( String nome, String endereco, String email, String telefone, String opcao ){
        HashMap< String, Command > comandos = new HashMap<>();
        comandos.put("completo", new CommandCadastroCompleto() );
        comandos.put("internet", new CommandCadastroInternet() );
        comandos.put("telefone", new CommandCadastroTelefone() );
        
        Command com = comandos.get( opcao );
        com.execute(nome, endereco, telefone, email);
        JOptionPane.showMessageDialog( null, com.getAgenda().getPessoa().toString() );
    }
}
