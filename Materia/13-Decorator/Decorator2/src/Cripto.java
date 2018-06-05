public class Cripto extends TextoDecorator{
    
    public Cripto(Texto texto) {
        super(texto);
    }
    
    @Override
    public String getTexto() {
        int aux;
        char s[] = super.getTexto().toCharArray();
        String r = "";
        for(int i = 0; i < s.length; i++){
            aux = (char) s[i];
            r += (char) (aux + 1);
        }
        return r;
    }
}
