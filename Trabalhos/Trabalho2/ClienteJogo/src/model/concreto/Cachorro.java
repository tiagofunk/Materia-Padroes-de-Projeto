package model.concreto;

import model.TipoAnimal;
import model.abstrato.PecaCaminhadora;

public class Cachorro extends PecaCaminhadora{

    public Cachorro() {
        super( TipoAnimal.CACHORRO );
    }
    
}
