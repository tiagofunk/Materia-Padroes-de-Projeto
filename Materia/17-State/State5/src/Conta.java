
public class Conta {
    
    private EstadoConta estado;
    
    private int numero;
    private int senha;

    public Conta(int numero, int senha) {
        this.numero = numero;
        this.senha = senha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", senha=" + senha + '}';
    }
    
    
}
