package model.builder;

import model.produto.Pessoa;

public class Agenda {
    
    private Cadastro cadastro;

    public Agenda(Cadastro cadastro) {
        this.cadastro = cadastro;
    }
    
    public void construir( String nome, String endereco, String email, String telefone ){
        cadastro.construirNome( nome );
        cadastro.construirEndereco( endereco );
        cadastro.construirEmail( email );
        cadastro.construirTelefone( telefone );
    }
    
    public Pessoa getPessoa(){
        return cadastro.getPessoa();
    }
}
