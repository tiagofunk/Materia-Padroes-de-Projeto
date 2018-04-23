package model.builder;

public class DiretorBandeja {

    private Bandeja bandeja;

    public DiretorBandeja(Bandeja bandeja) {
        this.bandeja = bandeja;
    }

    public void construir(){
        bandeja.construirSanduiche();
        bandeja.construirBatata();
        bandeja.construirBebida();
        bandeja.construirBrinquedo();
    }
    
    public Bandeja getBandeja() {
        return bandeja;
    }
    
}
