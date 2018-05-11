package meusistema;

public class TesteLog {
    
    private MostradorTexto mt;
    
    public TesteLog(MostradorTexto mt) {
        this.mt = mt;
    }

    public void imprimir(String texto) throws Exception {
        mt.mostrar(texto);
    }

    public static void main(String[] args) throws Exception {

        TesteLog teste1 = new TesteLog( new LogClasse() );
        teste1.imprimir("1");

        TesteLog teste2 = new TesteLog( new LogObjeto() );
        teste2.imprimir("2");

        TesteLog teste3 = new TesteLog( new WinClasse() );
        teste3.imprimir("3");

        TesteLog teste4 = new TesteLog( new WinObjeto() );
        teste4.imprimir("4");

    }

}
