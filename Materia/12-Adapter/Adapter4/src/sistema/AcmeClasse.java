package sistema;

public class AcmeClasse extends acme.Criptografar implements CriptografarAdapter{

    @Override
    public String criptografar(String user, String password, String texto) throws Exception  {
        super.cripto(texto);
        return super.getResultadoCriptografia();
    }
    
}
