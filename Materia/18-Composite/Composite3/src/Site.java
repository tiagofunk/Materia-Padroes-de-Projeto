
import java.util.ArrayList;
import java.util.List;

public class Site {

    public static void main(String[] args) {
        String titulo, url, conteudo;
        Pagina pag1, pag2, pag3;
        Postagem post1, post2;
        List<ComponentSite> listaComponentes = new ArrayList<>();

        pag1 = new Pagina("Conteudo1", "Titulo1", "url1");
        pag2 = new Pagina("Conteudo2", "Titulo2", "url2");
        pag3 = new Pagina("Conteudo3", "Titulo3", "url3");
        
        post1 = new Postagem("titulo11", "url11");
        post2 = new Postagem("titulo22", "url22");
        
        post1.addComponente(pag1);
        
        post2.addComponente(post1);
        post2.addComponente(pag2);
        
        listaComponentes.add(post1);
        listaComponentes.add(post2);
        listaComponentes.add(pag1);
        listaComponentes.add(pag2);
        listaComponentes.add(pag3);
        
        for (ComponentSite comp : listaComponentes) {
            comp.imprimir();
        }
    }
}
