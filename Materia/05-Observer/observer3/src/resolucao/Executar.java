package resolucao;

public class Executar {

	public static void main(String[] args) {
		Revista r1 = new Revista();
		r1.setNome( "R1: Caras" );
		
		Revista r2 = new Revista();
		r2.setNome( "R2: Claudia" );
		
		Assinante a1 = new Assinante();
		a1.setNome( "A1: Tiago" );
		
		Assinante a2 = new Assinante();
		a2.setNome( "A2: Adilson" );
		
		Assinante a3 = new Assinante();
		a3.setNome( "A3: Viviane" );
		
		Assinante a4 = new Assinante();
		a4.setNome( "A4: Douglas" );
		
		Assinante a5 = new Assinante();
		a5.setNome( "A5: Robson" );
		
		WebSite wb = new WebSite();
		wb.setUrl( "www.RevistasBonitas.com.br");
		
		/*                          */
		
		r1.registrar( a1 );
		r1.registrar( a2 );
		r1.registrar( a3 );
		
		r2.registrar( a2 );
		r2.registrar( a4 );
		
		r1.registrar( wb );
		r2.registrar( wb );
		
		/*                           */
		Artigo t1 = new Artigo();
		t1.setTitulo( "Artigo 01" );
		
		Artigo t2 = new Artigo();
		t2.setTitulo( "Artigo 02" );
		
		Edicao e1 = new Edicao();
		e1.setNumero( 1 );
		e1.addArtigos( t1 );
		e1.addArtigos( t2 );
		
		r1.lancarNovaEdicao( e1 );
		r2.lancarNovaEdicao( e1 );
		
		/*                            */
		Artigo t3 = new Artigo();
		t3.setTitulo( "Artigo 03" );
		
		Artigo t4 = new Artigo();
		t4.setTitulo( "Artigo 04" );
		
		Artigo t5 = new Artigo();
		t5.setTitulo( "Artigo 05" );
		
		Edicao e2 = new Edicao();
		e2.setNumero( 2 );
		e2.addArtigos( t3 );
		e2.addArtigos( t4 );
		e2.addArtigos( t5 );
		
		r1.lancarNovaEdicao( e2 );
		r2.lancarNovaEdicao( e2 );
	}
}
