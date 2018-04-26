package model.command;

import model.builder.Cadastro;

public class CommandCadastro implements Command {
    
    private Cadastro cadastro;
    
    public CommandCadastro( Cadastro cadastro ){
        this.cadastro = cadastro;
    }

    @Override
    public void execute(String nome, String endereco, String telefone, String email) {
        cadastro.construirNome(nome);
        cadastro.construirEmail(email);
        cadastro.construirEndereco(endereco);
        cadastro.construirTelefone(telefone);
    }
    
    
    
}
