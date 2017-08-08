#pragma once
#include "Figura.h"

class Circulo :
	public Figura{
public:
	Circulo();
	Circulo(int, int, int);
	Circulo(int, Figura);
	Circulo(int);
	int getRadio();
	void setRadio(int);

protected:
	int radio;
}; 
