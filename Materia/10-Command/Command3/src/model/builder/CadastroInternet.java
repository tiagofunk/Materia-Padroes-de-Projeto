package model.builder;

public class CadastroInternet extends Cadastro{
    
    @Override
    public void construirEmail( String email ){
        pessoa.setEmail( email );
    }
}
