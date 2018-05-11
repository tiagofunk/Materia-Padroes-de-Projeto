package sistema;

public class Executar {
    
    public static void main(String[] args) throws Exception {
        String text;
        CriptografarAdapter ca;
        Sessao s;
        
        s = Sessao.getInstance();
        s.iniciar();
        
        text = "texto";
        
        ca = new AcmeClasse();
        System.out.println( ca.criptografar( text ) );
        
        ca = new AcmeObjeto();
        System.out.println( ca.criptografar( text ) );
        
        ca = new XptoClasse();
        System.out.println( ca.criptografar( text ) );
        
        ca = new XptoObjeto();
        System.out.println( ca.criptografar( text ) );
        
        s.iniciar();
        text = "abc";
        
        ca = new AcmeClasse();
        System.out.println( ca.criptografar( text ) );
        
        ca = new AcmeObjeto();
        System.out.println( ca.criptografar( text ) );
        
        ca = new XptoClasse();
        System.out.println( ca.criptografar( text ) );
        
        ca = new XptoObjeto();
        System.out.println( ca.criptografar( text ) );
        
        
    }
}
