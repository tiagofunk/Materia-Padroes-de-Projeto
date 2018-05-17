package teste;

public class Teste {

	public Teste() {
	}

	public static void main(String[] args) {
		ControleRemoto cr = new ControleRemoto();
		
		cr.setCommand( new LigarLuzComand( new Luz() ) );
		cr.pressionarBotao();
		
		cr.setCommand( new AcionarPortaGaragemCommand( new PortaGaragem() ) );
		cr.pressionarBotao();
	}

}
