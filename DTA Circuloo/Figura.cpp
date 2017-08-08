#include "Figura.h"

Figura::Figura(){
	this->area=0;
	this->perimetro=0;
}
Figura::Figura(int area, int perimetro){
	this->area = area;
	this->perimetro = perimetro;
}

int Figura::getArea(){
	return this->area;
}

int Figura::getPerimetro(){
	return this->perimetro;
}

void Figura::setArea(int area){
	this->area = area;
}

void Figura::setPerimetro(int perimetro){
	this->perimetro = perimetro;
}
