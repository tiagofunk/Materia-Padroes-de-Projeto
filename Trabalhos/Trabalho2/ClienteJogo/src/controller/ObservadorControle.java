package controller;

public interface ObservadorControle {
    
    public void prepararTela();
    public void permitirJogada( boolean permitir );
    public void informar(String mensagem);

    public void informarNomeTela(String titulo);

    public void informarCasaClicada(int i, int j);
    public void limparEnfase();
    
    public void informarNumeroPecas( int pecasAmarelas, int pecasAzuis);
    
}
