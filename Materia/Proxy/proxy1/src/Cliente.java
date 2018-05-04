
public class Cliente {

	public static void main(String[] args) {
		Deposito d = new DepositoControle("Admin", "");
		d.armazenar(10);
		System.out.println(d.getQuantidade());
		d.retirar(3);
		System.out.println(d.getQuantidade());

		Deposito d2 = new DepositoControle("xpto", "");
		try {
			d2.armazenar(10);
		} catch (Exception ex) {
			
		}
		System.out.println(d2.getQuantidade());
	}

}
