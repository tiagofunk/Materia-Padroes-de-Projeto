package sistema;

public class AcmeClasse extends acme.Criptografar implements CriptografarAdapter{

    @Override
    public String criptografar(String texto) throws Exception  {
        super.cripto(texto);
        return super.getResultadoCriptografia();
    }
    
}
