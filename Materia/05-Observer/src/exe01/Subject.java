package exe01;

public interface Subject {

	public void registrar( Observer obs );
	public void remover( Observer obs );
	
	public void notificar( );
}
