package model;

public class EstadoJogavel extends EstadoJogo{

    public EstadoJogavel(Jogo jogo) {
        super(jogo);
    }

    @Override
    public void alterarEstado() {
        jogo.setEstadoJogo( new EstadoNaoJogavel(jogo) );
    }

    @Override
    public void informarClique(int i, int j) {
        jogo.permitirJogada(i, j);
    }
    
}
