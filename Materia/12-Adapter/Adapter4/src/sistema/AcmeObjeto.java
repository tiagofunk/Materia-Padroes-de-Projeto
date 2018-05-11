package sistema;

import acme.Criptografar;

public class AcmeObjeto implements sistema.CriptografarAdapter{
    
    private acme.Criptografar crip;

    public AcmeObjeto() {
        this.crip = new Criptografar();
    }

    @Override
    public String criptografar(String user, String password, String texto) throws Exception {
        crip.cripto(texto);
        return crip.getResultadoCriptografia();
    }
}
