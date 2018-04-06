#include <string>
using std::string;

#include "OrdemServico.h"
#include "Funcionario.h"
#include "Veiculo.h"
#include "Servico.h"

double OrdemServico::getValorTotalOrdem(){
	return 0.0;
}

void OrdemServico::RemoveFuncionario(Funcionario f){
	listaFuncionario.push_back( f );
}

void OrdemServico::addFuncionario(Funcionario f){

}

string OrdemServico::getDataConclusao() const
{
    return dataConclusao;
}

string OrdemServico::getDataExp() const
{
    return dataExp;
}

long OrdemServico::getNumero() const
{
    return numero;
}

void OrdemServico::setDataConclusao(string dataConclusao)
{
    this->dataConclusao = dataConclusao;
}

void OrdemServico::setDataExp(string dataExp)
{
    this->dataExp = dataExp;
}

void OrdemServico::setNumero(long  numero)
{
    this->numero = numero;
}

Cliente OrdemServico::getCliente() const
{
    return cliente;
}

void OrdemServico::setCliente(Cliente cliente)
{
    this->cliente = cliente;
}

Veiculo OrdemServico::getVeiculo() const
{
    return veiculo;
}

void OrdemServico::setVeiculo(Veiculo veiculo)
{
    this->veiculo = veiculo;
}

Servico OrdemServico::getServico() const
{
    return servico;
}

void OrdemServico::setServico(Servico servico)
{
    this->servico = servico;
}







