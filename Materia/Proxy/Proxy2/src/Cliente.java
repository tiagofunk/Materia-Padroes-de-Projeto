public class Cliente {

	private int codigo;

	public Cliente(int codigo) {
		this.codigo = codigo;
		System.out.println("Criou o cliente " + codigo);
	}

	public int getCodigo() {
		return codigo;
	}
	
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
