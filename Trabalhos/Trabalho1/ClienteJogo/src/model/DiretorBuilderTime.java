package model;

import java.util.Map;
import model.concreto.BuilderPecasConcreto;
import model.abstrato.FabricaPecas;
import model.abstrato.Peca;

public class DiretorBuilderTime {
    
    private BuilderPecasConcreto builderTime;

    public DiretorBuilderTime( FabricaPecas fp, TipoTime time ) {
        this.builderTime = new BuilderPecasConcreto( fp, time );
    }
    
    public void construirTime(){
        builderTime.construirCachorro();
        builderTime.construirElefante();
        builderTime.construirGato();
        builderTime.construirLeao();
        builderTime.construirLeopardo();
        builderTime.construirLobo();
        builderTime.construirRato();
        builderTime.construirTigre();
        builderTime.construirToca();
    }
    
    public Map<String, Peca> getPecas(){
        return builderTime.getPecas();
    }
}
