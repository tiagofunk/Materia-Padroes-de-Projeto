#include <string>
using std::string;

#include "Pessoa.h"

string Pessoa::getCpf() const{
    return cpf;
}

string Pessoa::getNome() const{
    return nome;
}

void Pessoa::setCpf(string cpf){
    this->cpf = cpf;
}

void Pessoa::setNome(string nome){
    this->nome = nome;
}
