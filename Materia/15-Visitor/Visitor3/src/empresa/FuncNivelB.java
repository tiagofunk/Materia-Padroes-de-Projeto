package empresa;

import visitor.FuncionarioVisitor;

public class FuncNivelB extends Funcionario {

    public FuncNivelB(String nome, double salario) {
        super(nome, salario, 30);
    }

    @Override
    public void accept(FuncionarioVisitor fv) {
        fv.visit(this);
    }

}
