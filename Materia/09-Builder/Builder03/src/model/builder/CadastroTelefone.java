package model.builder;

public class CadastroTelefone extends Cadastro{
    
    @Override
    public void construirTelefone( String telefone ){
        pessoa.setTelefone( telefone );
    }
}
