package model.builder;

public class CadastroTelefone extends Cadastro{
    
    @Override
    public void construirEmail( String email ){
        pessoa.setEmail( "" );
    }
    
    @Override
    public void construirEndereco( String endereco ){
        pessoa.setEndereco( "" );
    }
}
