#include <iostream>
#include "Figura.h"
#include "Circulo.h"

using namespace std;

int main(){
	Figura prueba1=Figura(4, 2);
	Circulo prueba=Circulo(8, prueba1);
	cout<<prueba.getRadio();
	cout<<prueba.getArea();
	cout<<prueba.getPerimetro();
	cin.get();
}
