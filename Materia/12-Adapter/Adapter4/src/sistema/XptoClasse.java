package sistema;

import xpto.Authentication;
import xpto.User;

public class XptoClasse extends xpto.Encrypt implements CriptografarAdapter {

    @Override
    public String criptografar(String user, String password, String texto) throws Exception {
       
        User u = new User();
        u.setName(user);
        u.setPassword(password);
        
        if( user.equals("Admin") ){
            Authentication.getInstance().enterAdministrativePrivileges(u);
        }else{
            Authentication.getInstance().enterCommonPrivileges(u);
        }
        
        return super.encrypt(texto);
    }
    
}
