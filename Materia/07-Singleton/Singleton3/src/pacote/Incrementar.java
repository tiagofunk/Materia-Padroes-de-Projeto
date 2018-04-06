package pacote;
import java.util.ArrayList;
import java.util.List;

public class Incrementar {
	
	private static Incrementar incr;
	
	private Incrementar() {
	}
	
	public synchronized static Incrementar getInstance() {
		if( incr == null ) {
			incr = new Incrementar();
		}
		return incr;
	}
	
	private int valor;
	
	public void inc() {
		valor++;
		for( Observador obs : listaObs ) {
			obs.atualizarValor( valor );
		}
	}
	
	public int getValor() {
		return valor;
	}

	private List< Observador > listaObs = new ArrayList<>();
	
	public void addObservador( Observador obs ) {
		listaObs.add( obs );
	}
	
	public void removeObservador( Observador obs ) {
		listaObs.remove( obs );
	}
}
