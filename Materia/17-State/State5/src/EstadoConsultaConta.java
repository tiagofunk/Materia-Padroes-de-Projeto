
public class EstadoConsultaConta extends EstadoCaixaEletronico{

    public EstadoConsultaConta(CaixaEletronico conta) {
        super(conta);
    }

    @Override
    public void consultarConta(int numero) throws Exception {
        Conta c = caixa.buscarConta(numero);
        if( c != null){
            conta = c;
            caixa.setEstado( new EstadoContaExistente(caixa) );
        }
    }

    @Override
    public void validarSenha(int senha) throws Exception {
        throw new Exception("Operação inválida !!");
    }

    @Override
    public void senhaValida() throws Exception {
        throw new Exception("Operação inválida !!");
    }

    @Override
    public void sacarValor(double valor) throws Exception {
        throw new Exception("Operação inválida !!");
    }

    @Override
    public void encerrarConta() throws Exception {
        throw new Exception("Operação inválida !!");
    }
    
    
}
