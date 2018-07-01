public class Pagina extends ComponentSite{

    private String conteudo;

    public Pagina(String conteudo, String titulo, String url) {
        super(titulo, url);
        this.conteudo = conteudo;
    }    
    
    @Override
    public void imprimir() {
        System.out.print( super.toString() + "conteudo=" + conteudo + "/");
    }
    
}
