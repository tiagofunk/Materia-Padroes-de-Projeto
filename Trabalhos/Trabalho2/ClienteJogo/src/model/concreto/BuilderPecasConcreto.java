package model.concreto;

import model.TipoTime;
import model.abstrato.BuilderPecas;
import model.abstrato.FabricaPecas;
import utils.Constantes;

public class BuilderPecasConcreto extends BuilderPecas{
    
    public BuilderPecasConcreto( FabricaPecas fp, TipoTime time ){
        super(fp, time);
    }

    @Override
    public void construirCachorro(){
        Cachorro c = fp.criarCachorro();
        c.setTime( time );
        listasPecas.put( Constantes.ID_CACHORRO, c );
    }
    
    @Override
    public void construirElefante(){
        Elefante e = fp.criarElefante();
        e.setTime( time );
        listasPecas.put( Constantes.ID_ELEFANTE, e );
    }
    
    
    @Override
    public void construirGato(){
        Gato g = fp.criarGato();
        g.setTime( time );
        listasPecas.put( Constantes.ID_GATO, g);
    }
    
    @Override
    public void construirLeao(){
        Leao l = fp.criarLeao();
        l.setTime( time );
        listasPecas.put( Constantes.ID_LEAO, l );
    }
    
    @Override
    public void construirLeopardo(){
        Leopardo l = fp.criarLeopardo();
        l.setTime( time );
        listasPecas.put( Constantes.ID_LEOPARDO, l );
    }
    
    @Override
    public void construirLobo(){
        Lobo l = fp.criarLobo();
        l.setTime( time );
        listasPecas.put( Constantes.ID_LOBO, l );
    }
    
    @Override
    public void construirRato(){
        Rato r = fp.criarRato();
        r.setTime( time );
        listasPecas.put( Constantes.ID_RATO, r );
    }
    
    @Override
    public void construirTigre(){
        Tigre t = fp.criarTigre();
        t.setTime( time );
        listasPecas.put( Constantes.ID_TIGRE, t );
    }
    
    @Override
    public void construirToca(){
        Toca t = fp.criarToca();
        t.setTime( time );
        listasPecas.put( Constantes.ID_TOCA, t );
    }

}
