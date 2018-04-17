import builder.BancoBradesco;
import builder.BancoCaixa;


public class Cliente {

	public static void main(String[] args) {

		// Bradesco
		GeradorBoleto gerador1 = new GeradorBoleto( new BancoBradesco() );
		gerador1.construir("Bino", "001", "01010101");
		System.out.println("Bradesco: " + gerador1.getBoleto());
		
		// Caixa
		GeradorBoleto gerador2 = new GeradorBoleto( new BancoCaixa() );
		gerador2.construir("Bino", "001", "01010101");
		System.out.println("Caixa: " + gerador2.getBoleto());
	}

}
