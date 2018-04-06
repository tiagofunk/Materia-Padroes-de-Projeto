package controller;

public interface Controller {
    
    public void agendar( int idAnimal, String horario, String data);
    public void buscarAnimal( int idAnimal );
    
    public void addObservador( Observador obs );
    public void removeObservador( Observador obs );
}
