package model;

import java.util.Map;
import model.abstrato.BuilderTime;
import model.abstrato.FabricaPecas;
import model.abstrato.Peca;

public class DiretorBuilderTime {
    
    private BuilderTime builderTime;

    public DiretorBuilderTime( FabricaPecas fp ) {
//        this.builderTime = new BuilderTime( fp );
    }
    
    public void construirTime(){
        builderTime.construirArmadilha();
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
