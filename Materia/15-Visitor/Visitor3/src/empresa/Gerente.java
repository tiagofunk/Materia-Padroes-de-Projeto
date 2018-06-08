package empresa;

import visitor.FuncionarioVisitor;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario, 25);
    }

    @Override
    public void accept(FuncionarioVisitor fv) {
        fv.visit(this);
    }

}
