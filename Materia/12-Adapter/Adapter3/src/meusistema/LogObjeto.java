package meusistema;

import logconsole.LogConsole;

public class LogObjeto implements MostradorTexto{
    
    private logconsole.LogConsole adapter;

    public LogObjeto(LogConsole adapter) {
        this.adapter = adapter;
    }
    
    @Override
    public void mostrar(String mensagem) {
        adapter.log(mensagem);
    }
    
}
