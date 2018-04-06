#ifndef ORDEMSERVICO_H_
#define ORDEMSERVICO_H_

#include <string>
using std::string;

#include <vector>
using std::vector;

#include "Funcionario.h"
#include "Cliente.h"
#include "Veiculo.h"
#include "Servico.h"

class OrdemServico {
public:
	double getValorTotalOrdem();

	void addFuncionario( Funcionario f );
	void RemoveFuncionario( Funcionario f );
	Cliente getCliente() const;
	void setCliente(Cliente cliente);
	Veiculo getVeiculo() const;
	void setVeiculo(Veiculo veiculo);
	Servico getServico() const;
	void setServico(Servico servico);

    string getDataConclusao() const;
    string getDataExp() const;
    long getNumero() const;
    void setDataConclusao(string dataConclusao);
    void setDataExp(string dataExp);
    void setNumero(long  numero);

private:
	long numero;
	string dataExp;
	string dataConclusao;

	vector< Funcionario > listaFuncionario;
	Cliente cliente;
	Veiculo veiculo;

	Servico servico;

};
#endif /* ORDEMSERVICO_H_ */
