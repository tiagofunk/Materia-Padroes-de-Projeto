package sistema;

import xpto.Authentication;
import xpto.User;

public class XptoClasse extends xpto.Encrypt implements CriptografarAdapter {

    @Override
    public String criptografar(String texto) throws Exception {
       
        User u = new User();
        u.setName( Sessao.getInstance().getUser() );
        u.setPassword( Sessao.getInstance().getPassword() );
        
        if( u.getName().equals("Admin") ){
            Authentication.getInstance().enterAdministrativePrivileges(u);
        }else{
            Authentication.getInstance().enterCommonPrivileges(u);
        }      
        return super.encrypt(texto);
    }
    
}
