#ifndef FUNCIONARIO_H_
#define FUNCIONARIO_H_

#include <string>
using std::string;

#include "Pessoa.h"

class Funcionario : virtual public Pessoa {
private:
	string dataAdmissao;
	double salario;

public:
    string getDataAdmissao() const;
    double getSalario() const;
    void setDataAdmissao(string dataAdmissao);
    void setSalario(double salario);
};

#endif /* FUNCIONARIO_H_ */
