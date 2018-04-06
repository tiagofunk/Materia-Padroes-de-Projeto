#ifndef SERVICO_H_
#define SERVICO_H_

#include <string>
using std::string;

class Servico {
public:
    string getDescricao() const;
    double getValor() const;
    void setDescricao(string descricao);
    void setValor(double valor);

private:
	string descricao;
	double valor;

};
#endif /* SERVICO_H_ */
