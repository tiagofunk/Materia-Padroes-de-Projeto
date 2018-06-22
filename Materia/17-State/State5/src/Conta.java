
import java.util.Random;


public class Conta {
    
    private int numero;
    private int senha;
    private double valor;
    
    private static int contadorNumero = 1;
    private static int contadorSenha = 1;

    public Conta() {
        numero = contadorNumero++;
        senha = contadorSenha++;
        valor = new Random().nextDouble()*100;
    }

    public int getNumero() {
        return numero;
    }

    public int getSenha() {
        return senha;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", senha=" + senha + ", valor=" + valor + '}';
    }
    
}
