#ifndef PESSOA_H_
#define PESSOA_H_

#include <string>
using std::string;

class Pessoa {
private:
	string nome;
	string cpf;

public:
    string getCpf() const;
    string getNome() const;
    void setCpf(string cpf);
    void setNome(string nome);

};

#endif /* PESSOA_H_ */
