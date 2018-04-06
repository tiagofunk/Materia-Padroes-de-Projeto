package resolucao;

public class Assinante implements Observer {

	private String nome;
	private String endereco;
	
	private Revista rev;
	private Edicao edi;
	
	@Override
	public void update( Revista rev, Edicao edi ) {
		this.rev = rev;
		this.edi = edi;
		System.out.println( "Nome: " + nome + ", Revista: " + rev.getNome() + ", Edição: " + edi.getNumero() );
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
