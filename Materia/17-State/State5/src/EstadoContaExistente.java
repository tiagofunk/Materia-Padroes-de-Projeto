public class EstadoContaExistente extends EstadoCaixaEletronico{

    public EstadoContaExistente(CaixaEletronico caixa) {
        super(caixa);
    }

    @Override
    public void consultarConta(int numero) throws Exception {
        throw new Exception("Operação inválida !!");
    }

    @Override
    public void validarSenha(int senha) throws Exception {
        if( conta.getSenha() == senha ){
            if( conta.getValor() > 0 ){
                caixa.setEstado( new EstadoSacarValor(caixa) );
            }else{
                caixa.setEstado( new EstadoEncerrarConta(caixa) );
            }
        }else{
            System.out.println("Senha invalida !!");
        }
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
