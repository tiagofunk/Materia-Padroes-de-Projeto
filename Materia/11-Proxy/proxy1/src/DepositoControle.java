public class DepositoControle extends Deposito {

	private String passw;
	private String user;

	public DepositoControle(String user, String passw) {
		this.user = user;
		this.passw = passw;
	}
	
	@Override
	public void armazenar(int qtdade) {
		if (user.equals("Admin"))
			super.armazenar(qtdade);
		else
			throw new RuntimeException("Acesso negado");
	}
	
	@Override
	public int retirar(int qtdade) {
		if (user.equals("Admin"))
			return super.retirar(qtdade);
		else
			throw new RuntimeException("Acesso negado");
	}
	
}
