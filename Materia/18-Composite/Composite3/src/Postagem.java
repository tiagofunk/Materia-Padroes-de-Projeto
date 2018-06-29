
import java.util.ArrayList;
import java.util.List;

public class Postagem extends ComponentSite{
    
    private List<ComponentSite> listaComponentes = new ArrayList<>();

    public Postagem(String titulo, String url) {
        super(titulo, url);
    }
    
    public void addComponente(ComponentSite componente){
        listaComponentes.add(componente);
    }

    public void removeComponente(ComponentSite componente){
        listaComponentes.add(componente);
    }
    
    public ComponentSite getComponenteSite(int indice){
        return listaComponentes.get(indice);
    }
    
    @Override
    public void imprimir() {
        String s = super.toString();
        for(ComponentSite comp: listaComponentes){
            comp.imprimir();
        }
        System.out.println(s);
    }
    
}
