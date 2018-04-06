package exe02;

public interface Observado {
	
	public void registrar( Observador obs );
	public void remover( Observador obs );
	
	public void notificar( );
	
}
