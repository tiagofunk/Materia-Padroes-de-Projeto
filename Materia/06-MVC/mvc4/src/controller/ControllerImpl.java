package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Animal;
import model.Consulta;

public class ControllerImpl implements Controller{
    
    private List< Observador > listaObservadores = new ArrayList<>();
    
    private List< Consulta > listaConsultas = new ArrayList<>();
    private List< Animal > listaAnimal = new ArrayList<>();

    public ControllerImpl() {
        listaAnimal.add( new Animal( 1, "Gato", "Tiago") );
        listaAnimal.add( new Animal( 2, "Cachorro", "Nilce") );
    }
    
    @Override
    public void addObservador( Observador obs ){
        listaObservadores.add( obs );
    }
    
    @Override
    public void removeObservador( Observador obs ){
        listaObservadores.remove( obs );
    }

    @Override
    public void agendar(int idAnimal, String horario, String data) {
        Animal a = null;
        for( Animal ani : listaAnimal ){
            if( ani.getIdAnimal() == idAnimal ){
                a = ani;
            }
        }
        if( a != null ){
            Consulta c = new Consulta( a, horario, data );
        
            boolean encontrou = false;
            for( Consulta con: listaConsultas ){
                if( con.getData().equals( c.getData() ) 
                        && con.getHorario().equals( c.getHorario() ) ){
                    encontrou = true;
                }
            }

            if( !encontrou ){
                listaConsultas.add( c );
                for( Observador obs : listaObservadores ){
                    obs.atualizarAgendamentos( c );
                }
            }else{
                JOptionPane.showMessageDialog(null, "Horário já ocupado !!" );
            }
        }else{
            JOptionPane.showMessageDialog( null , "Nenhum animal encontrado !!");
        }
    }

    @Override
    public void buscarAnimal(int idAnimal) {
        Animal a = null;
        for( Animal ani : listaAnimal ){
            if( ani.getIdAnimal() == idAnimal ){
                a = ani;
            }
        }
        
        for( Observador obs : listaObservadores ){
            obs.atualizarBusca( a );
        }
        if( a == null ){
            JOptionPane.showMessageDialog( null, "Nenhum animal encontrado !!" );
        }
    }
    
    
}
