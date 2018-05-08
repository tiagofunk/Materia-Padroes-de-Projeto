package meusistema;

public class LogClasse extends logconsole.LogConsole implements MostradorTexto{

    @Override
    public void mostrar(String mensagem) {
        super.log(mensagem);
    }
    
}
