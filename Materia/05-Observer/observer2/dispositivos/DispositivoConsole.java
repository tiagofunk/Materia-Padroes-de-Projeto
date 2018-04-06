package dispositivos;

import estacao.EstacaoMeteorologica;
import estacao.ObservadorTempo;

public class DispositivoConsole implements ObservadorTempo {
	
	private EstacaoMeteorologica em;
	
	public DispositivoConsole(EstacaoMeteorologica em) {
		this.em = em;
		this.em.registrar( this );
	}


	@Override
	public void atualizar(EstacaoMeteorologica estacao) {
		this.em = em;
		display();
	}

	public void display() {
		System.out.println("Tempratura: " + em.getTemperatura() + ", Umidade: " + em.getUmidade() );
	}
	
}
