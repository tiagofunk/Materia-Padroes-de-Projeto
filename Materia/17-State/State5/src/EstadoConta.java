
public abstract class EstadoConta {
    
    protected Conta conta;
    
    public EstadoConta(Conta conta){
        this.conta = conta;
    }
    
    public abstract void localizada(int numero) throws Exception;
    public abstract void logar(int senha) throws Exception;
    public abstract void verifcarSaldo() throws Exception;
    public abstract void sacar() throws Exception;
    public abstract void encerrar() throws Exception;
    
}
