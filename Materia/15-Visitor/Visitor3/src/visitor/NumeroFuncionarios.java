package visitor;

import empresa.FuncNivelA;
import empresa.FuncNivelB;
import empresa.Gerente;

public class NumeroFuncionarios implements FuncionarioVisitor{
    
    private int numeroFuncionarios;

    public NumeroFuncionarios() {
        this.numeroFuncionarios = 0;
    }
    
    @Override
    public void visit(Gerente gerente){
        gerente.setFeriasAGozar(gerente.getFeriasAGozar()-10);
        numeroFuncionarios++;
    }
    
    @Override
    public void visit(FuncNivelA funcionario){
        if( funcionario.getSalario() >= 5000 ){
            funcionario.setFeriasAGozar(funcionario.getFeriasAGozar()-10);
            numeroFuncionarios++;
        }
    }
    
    @Override
    public void visit(FuncNivelB funcionario){
        if( funcionario.getSalario() >= 1500 ){
            funcionario.setFeriasAGozar(funcionario.getFeriasAGozar()-5);
            numeroFuncionarios++;
        }
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }
    
}
