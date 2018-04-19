package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.builder.Cadastro;
import model.builder.CadastroCompleto;
import model.builder.CadastroInternet;
import model.builder.CadastroTelefone;
import model.produto.Pessoa;

public class Controle {
    
    private Cadastro cadastro;

    private List< Pessoa > listaPessoas = new ArrayList<>();
    
    public void cadastrar( String nome, String endereco, String email, String telefone, char opcao ){
        switch (opcao) {
            case 'c':
                cadastro = new CadastroCompleto();
                break;
            case 'i':
                cadastro = new CadastroInternet();
                break;
            case 't':
                cadastro = new CadastroTelefone();
                break;
            default:
                break;
        }
        
        cadastro.construirNome( nome );
        cadastro.construirEndereco( endereco );
        cadastro.construirEmail( email );
        cadastro.construirTelefone( telefone );
        
        listaPessoas.add( cadastro.getPessoa() );
        
        JOptionPane.showMessageDialog( null, cadastro.getPessoa().toString() );
    }
}
