package sistema;

import java.util.Scanner;

public class Sessao {
    
    private static Sessao s;
    
    public static Sessao getInstance(){
        if( s == null ){
            s = new Sessao();
        }
        return s;
    }
    
    private String user;
    private String password;
    Scanner ler = new Scanner( System.in );

    private Sessao() {
    }
    
    public void iniciar(){
         System.out.print("Usuário: ");
        user = ler.next();
        
        System.out.print("Senha: ");
        password = ler.next();

    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
    
}
