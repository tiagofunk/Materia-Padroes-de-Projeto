
import java.util.ArrayList;
import java.util.List;

public class Paginas {

    public static void main(String[] args) {
        String titulo, url, conteudo;
        Pagina pag1, pag2, pag3;
        Postagem post1, post2;
        List<ComponentSite> listaComponentes = new ArrayList<>();

        titulo = "pagina" + 1;
        url = "url" + 1;
        conteudo = "conteudo" + 1;
        pag1 = new Pagina(conteudo, titulo, url);
        listaComponentes.add(pag1);

        for (int i = 11; i < 15; i++) {
            titulo = "postagem" + i;
            url = "url" + i;
            conteudo = "conteudo" + i;
            post = new Postagem(titulo, url);
            listaComponentes.add(post);
        }

        ComponentSite componente = listaComponentes.get(12);
        componente.
        
        
        for (ComponentSite comp : listaComponentes) {
            comp.imprimir();
        }
    }
}
