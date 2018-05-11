package sistema;

import xpto.Authentication;
import xpto.Encrypt;
import xpto.User;

public class XptoObjeto implements CriptografarAdapter{
    
    private Encrypt crip;

    public XptoObjeto() {
        this.crip = new Encrypt();
    }
    
    @Override
    public String criptografar(String user, String password, String texto) throws Exception {
        User u = new User();
        u.setName(user);
        u.setPassword(password);
        
        if( user.equals("admin") ){
            Authentication.getInstance().enterAdministrativePrivileges(u);
        }else{
            Authentication.getInstance().enterCommonPrivileges(u);
        }
        
        return crip.encrypt(texto);
    }
    
}
