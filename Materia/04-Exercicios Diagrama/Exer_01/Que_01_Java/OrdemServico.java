package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdemServico {

    private long numero;
    private Date dataExp;
    private Date dataConclusao;
    
    private List<Funcionario> funcionarios = new ArrayList<>();
    private Cliente cliente;
    private List<Veiculo> veiculo;
    
    private List<Servico> servicos = new ArrayList<>();
    
    public double getValorTotalOrdem(){
        return 0.0;
    }
    
    public void addFuncionario( Funcionario f ){
        funcionarios.add(f);
    }
    
    public void removeFuncionario( Funcionario f ){
        funcionarios.remove(f);
    }
    
    public void addServico( Servico s ){
        servicos.add(s);
    }
    
    public void removeServico( Servico s ){
        servicos.remove(s);
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Date getDataExp() {
        return dataExp;
    }

    public void setDataExp(Date dataExp) {
        this.dataExp = dataExp;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }
}
