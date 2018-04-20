package model.builder;

import model.produto.Pessoa;

public abstract class Cadastro {
    
    protected Pessoa pessoa;

    public Cadastro() {
        this.pessoa = new Pessoa();
    }
    
    public void construirNome( String nome ){
        pessoa.setNome( nome );
    }
    
    public void construirEndereco( String endereco ){
    }
    
    public void construirEmail( String email ){
    }
    
    public void construirTelefone( String telefone ){
    }
    
    public Pessoa getPessoa(){
       return pessoa;
    }
}
