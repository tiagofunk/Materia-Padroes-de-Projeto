package meusistema;

import swinglog.WinMsg;

public class WinObjeto implements MostradorTexto{
    
    private WinMsg win;

    public WinObjeto() {
        this.win = new WinMsg();
    }

    @Override
    public void mostrar(String mensagem) {
        win.mostrar(mensagem);
    }
    
}
