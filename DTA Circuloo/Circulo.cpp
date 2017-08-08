#include "Circulo.h"

Circulo::Circulo(){
	this->radio=0;
}

Circulo::Circulo(int area, int perimetro, int radio){
	this->area = area;
	this->perimetro = perimetro;
	this->radio = radio;
}

Circulo::Circulo(int radio, Figura figura){
	this->area = figura.getArea();
	this->perimetro = figura.getPerimetro();
	this->radio = radio;
}

Circulo::Circulo(int radio){
	this->radio = radio;
}

int Circulo::getRadio() {
	return this->radio;
}

void Circulo::setRadio(int radio){
	this->radio = radio;
}
