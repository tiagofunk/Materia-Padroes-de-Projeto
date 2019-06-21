package model;

public class EstadoFimJogo extends EstadoJogo{
    
    public EstadoFimJogo(Jogo jogo) {
        super(jogo);
    }

    @Override
    public void informarClique(int i, int j) {
        jogo.informarFimJogo();
    }

    @Override
    public void alterarEstado() {
        
    }
    
}
