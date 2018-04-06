#include <string>
using std::string;

#include "Veiculo.h"

string Veiculo::getMarca() const
{
    return marca;
}

string Veiculo::getModelo() const
{
    return modelo;
}

string Veiculo::getPlaca() const
{
    return placa;
}


Cliente Veiculo::getCliente() const
{
    return cliente;
}

void Veiculo::setMarca(string marca)
{
    this->marca = marca;
}

void Veiculo::setModelo(string modelo)
{
    this->modelo = modelo;
}

void Veiculo::setPlaca(string placa)
{
    this->placa = placa;
}

void Veiculo::setCliente(Cliente cliente)
{
    this->cliente = cliente;
}



