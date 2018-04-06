#ifndef VEICULO_H_
#define VEICULO_H_

#include <string>
using std::string;

#include "Cliente.h"

class Veiculo {
public:
    string getMarca() const;
    string getModelo() const;
    string getPlaca() const;
    Cliente getCliente() const;

    void setMarca(string marca);
    void setModelo(string modelo);
    void setPlaca(string placa);
    void setCliente(Cliente cliente);

private:
	string placa;
	string marca;
	string modelo;

	Cliente cliente;
};

#endif /* VEICULO_H_ */
