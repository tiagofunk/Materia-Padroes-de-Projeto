package meusistema;

import logconsole.LogConsole;

public class TesteLog {
    
    private MostradorTexto mt;
    
    public TesteLog(MostradorTexto mt) {
        this.mt = mt;
    }

    public void imprimir(String texto) {
        mt.mostrar(texto);
    }

    public static void main(String[] args) {

        TesteLog teste1 = new TesteLog( new LogClasse() );
        teste1.imprimir("123");

        TesteLog teste2 = new TesteLog( new LogObjeto( new LogConsole() ) );
        teste2.imprimir("123");
//
//        TesteLog teste3 = new TesteLog(/*passar uma instancia do adaptador de objeto do winlog*/);
//        teste3.imprimir("123");
//
//        TesteLog teste4 = new TesteLog(/*passar uma instancia do adaptador de objeto do winlog*/);
//        teste4.imprimir("123");

    }

}
