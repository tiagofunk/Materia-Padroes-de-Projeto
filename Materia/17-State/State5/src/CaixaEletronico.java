
import java.util.ArrayList;
import java.util.List;


public class CaixaEletronico {
    
    private EstadoCaixaEletronico estado;
    
    private List<Conta> listaContas;

    public CaixaEletronico() {
        estado = new EstadoConsultaConta(this);
        
        listaContas = new ArrayList<>();
        listaContas.add( new Conta() );
        listaContas.add( new Conta() );
        listaContas.add( new Conta() );
    }

    public void setEstado(EstadoCaixaEletronico estado) {
        this.estado = estado;
    }
    
    public Conta buscarConta(int numero){
        numero--;
        if( numero < 0 || numero > listaContas.size() ){
            return null;
        }
        return listaContas.get(numero);
    }
    
    public void consultarConta(int numero) throws Exception {
        estado.consultarConta(numero);
    }

    public void validarSenha(int senha) throws Exception {
        estado.validarSenha(senha);
    }

    public void senhaValida() throws Exception {
        estado.senhaValida();
    }

    public void sacarValor(double valor) throws Exception {
        estado.sacarValor(valor);
    }

    public void encerrarConta() throws Exception {
        estado.encerrarConta();
    }
}
