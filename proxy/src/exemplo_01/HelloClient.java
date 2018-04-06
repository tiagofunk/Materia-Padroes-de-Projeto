package exemplo_01;

import java.rmi.Naming;

public class HelloClient {
	static String message = "blank";

	static Hello obj = null;

	public static void main(String args[]) {
		try {
			obj = (Hello) Naming.lookup("//kvist.cs.umu.se/Hello");
			message = obj.Hello();
			System.out.println("Mensagem no servidor RMI de: \"" + message + "\"");
		} catch (Exception e) {
			System.out.println("HelloClient exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}