package exemplo_01;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Executar {

	public static void main(String[] args) {
		
		try {
			MyRemote servico = new MyRemoteImpl();
			Naming.rebind( "RemoteHello", servico );
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
