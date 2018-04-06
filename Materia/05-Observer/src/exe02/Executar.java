package exe02;

public class Executar {
		public static void main(String[] args) {
			Estacao est = new Estacao();
			
			Console con = new Console( est );
			
			est.setTemperatura( 40 );
			
			
			Janela jan = new Janela( est );
			
			est.setTemperatura( 20 );
			
			est.setUmidade( 55 );
			
			est.remover( jan );
			
			est.setTemperatura( 120 );
		}
}
