package model;

public interface ObservadorJogo {
    
    public void realizarJogadaValida(int i, int j);
    public void informarJogadaNaoValida();

    public void informarFimPartida(boolean estaVenceu, boolean comunicar );
}
