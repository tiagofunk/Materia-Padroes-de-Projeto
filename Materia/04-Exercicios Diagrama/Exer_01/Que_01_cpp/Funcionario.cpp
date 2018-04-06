#include "Funcionario.h"

string Funcionario::getDataAdmissao() const {
    return dataAdmissao;
}

double Funcionario::getSalario() const {
    return salario;
}

void Funcionario::setDataAdmissao(string dataAdmissao) {
    this->dataAdmissao = dataAdmissao;
}

void Funcionario::setSalario(double salario) {
    this->salario = salario;
}

