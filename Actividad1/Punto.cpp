#include "punto.h"

punto::punto(int coorx, int coory, int coorz) {
	this->x = coorx;
	this->y = coory;
	this->z = coorz;
	this->dimension = "3 dimensiones";
}

punto::punto(int coorx, int coory) {
	this->x = coorx;
	this->y = coory;
	this->z = NULL;
	this->dimension = "2 dimensiones";
}

punto::punto(int coorx) {
	this->x = coorx;
	this->y = NULL;
	this->z = NULL;
	this->dimension = "1 dimension";
}

punto::punto() {
	this->x = NULL;
	this->y = NULL;
	this->z = NULL;
	this->dimension = "sin dimensiones";
}

int punto::getx()
{
	return this->x;
}
int punto::gety()
{
	return this->y;
}
int punto::getz()
{
	return this->z;
}
std::string punto::getdimension()
{
	return this->dimension;
}

void punto::setx(int coorx) {
	this->x = coorx;
}
void punto::sety(int coory) {
	this->y = coory;
}
void punto::setz(int coorz) {
	this->z = coorz;
}
void punto::setdimension(std::string dimension) {
	this->dimension = dimension;
}