
public abstract class EstadoCaixaEletronico {
    
    protected Conta conta;
    protected CaixaEletronico caixa;
    
    public EstadoCaixaEletronico(CaixaEletronico caixa){
        this.caixa = caixa;
    }
    
    public abstract void consultarConta(int numero) throws Exception;
    public abstract void validarSenha(int senha) throws Exception;
    public abstract void senhaValida() throws Exception;
    public abstract void sacarValor(double valor) throws Exception;
    public abstract void encerrarConta() throws Exception;
    
    
    
}
