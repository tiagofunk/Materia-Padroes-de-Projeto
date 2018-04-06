package resolucao;

public class WebSite implements Observer {
	
	private String url;
	
	private Revista rev;
	private Edicao edi;
	
	@Override
	public void update( Revista rev, Edicao edi ) {
		this.rev = rev;
		this.edi = edi;
		String s = "Revista: " + rev.getNome() + ", Edição: " + edi.getNumero() + "\nArtigos:\n ";
		for( Artigo a : edi.getArtigos() ){
			s += "\t" + a.getTitulo() + "\n";
		}
		System.out.println( s );
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
