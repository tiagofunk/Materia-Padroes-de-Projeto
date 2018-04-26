package model.builder;

public class CadastroCompleto extends Cadastro{
    
    @Override
    public void construirEndereco( String endereco ){
        pessoa.setEndereco( endereco );
    }
    
    @Override
    public void construirEmail( String email ){
        pessoa.setEmail( email );
    }
    
    @Override
    public void construirTelefone( String telefone ){
        pessoa.setTelefone( telefone );
    }
}
