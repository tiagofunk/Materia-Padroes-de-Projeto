#include "Cliente.h"

bool Cliente::isVip() const {
	return vip;
}

void Cliente::setVip(bool vip){
	this->vip = vip;
}
