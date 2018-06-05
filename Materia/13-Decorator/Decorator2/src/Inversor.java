
public class Inversor extends TextoDecorator{
    
    public Inversor(Texto texto) {
        super(texto);
    }
    
    @Override
    public String getTexto() {
        String s = super.getTexto();
        String r = "";
        for( int i = 0; i < s.length(); i++){
            r += s.charAt( s.length() - i - 1 );
        }
        return r;
    }
}
