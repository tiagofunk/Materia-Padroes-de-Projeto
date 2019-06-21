package model;

public class EstadoNaoJogavel extends EstadoJogo {

    public EstadoNaoJogavel(Jogo jogo) {
        super(jogo);
    }

    @Override
    public void alterarEstado() {
        jogo.setEstadoJogo( new EstadoJogavel(jogo) );
    }

    @Override
    public void informarClique(int i, int j) {
        jogo.negarJogada();
    }
    
}
