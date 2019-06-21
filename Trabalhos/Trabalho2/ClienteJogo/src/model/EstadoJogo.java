package model;

public abstract class EstadoJogo {
    
    protected Jogo jogo;

    public EstadoJogo(Jogo jogo) {
        this.jogo = jogo;
    }
    
    public abstract void informarClique(int i, int j);
    public abstract void alterarEstado();
}
