#include <string>
using std::string;

#include "Servico.h"

string Servico::getDescricao() const
{
    return descricao;
}

double Servico::getValor() const
{
    return valor;
}

void Servico::setDescricao(string descricao)
{
    this->descricao = descricao;
}

void Servico::setValor(double valor)
{
    this->valor = valor;
}

