public abstract class ComponentSite {
    
    private String titulo;
    private String url;

    public ComponentSite(String titulo, String url) {
        this.titulo = titulo;
        this.url = url;
    }
    
    public abstract  void imprimir();

    @Override
    public String toString() {
        return "titulo=" + titulo + ", url=" + url + ", ";
    }
    
    
}
