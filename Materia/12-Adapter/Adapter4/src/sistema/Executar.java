package sistema;

public class Executar {
    
    public static void main(String[] args) throws Exception {
        String user, pass, text;
        CriptografarAdapter ca;
        
        user = "us1";
        pass = "us1";
        text = "abc";
        /*
        ca = new AcmeClasse();
        ca.criptografar( user, pass, text );
        
        ca = new AcmeObjeto();
        ca.criptografar(user, pass, text);
        */
        ca = new XptoClasse();
        ca.criptografar(user, pass, text);
        /*
        ca = new XptoObjeto();
        ca.criptografar(user, pass, text);
        
        user = "Admin";
        pass = "Admin";
        text = "abc";
        
        ca = new AcmeClasse();
        ca.criptografar( user, pass, text );
        
        ca = new AcmeObjeto();
        ca.criptografar(user, pass, text);
        
        ca = new XptoClasse();
        ca.criptografar(user, pass, text);
        
        ca = new XptoObjeto();
        ca.criptografar(user, pass, text);
        */
        
    }
}
