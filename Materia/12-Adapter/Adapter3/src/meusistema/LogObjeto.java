package meusistema;

import logconsole.LogConsole;

public class LogObjeto implements MostradorTexto{
    
    private logconsole.LogConsole adapter;

    public LogObjeto() {
        this.adapter = new LogConsole();
    }
    
    @Override
    public void mostrar(String mensagem) {
        adapter.log(mensagem);
    }
    
}
