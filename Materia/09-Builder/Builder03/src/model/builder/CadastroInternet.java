package model.builder;

public class CadastroInternet extends Cadastro{
    
    @Override
    public void construirTelefone( String Telefone ){
        pessoa.setTelefone( "" );
    }
    
    @Override
    public void construirEndereco( String endereco ){
        pessoa.setEndereco( "" );
    }
}
