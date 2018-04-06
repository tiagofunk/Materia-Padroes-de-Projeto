package controller;

import model.Animal;
import model.Consulta;

public interface Observador {
    
    public void atualizarAgendamentos( Consulta c );
    public void atualizarBusca( Animal a );
}
