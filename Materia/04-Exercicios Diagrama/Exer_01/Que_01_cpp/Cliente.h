#ifndef CLIENTE_H_
#define CLIENTE_H_

#include "Pessoa.h"

class Cliente : virtual public Pessoa {
public:
	bool isVip() const;
	void setVip(bool vip);

private:
	bool vip;
};

#endif /* CLIENTE_H_ */
