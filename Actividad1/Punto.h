#pragma once
#include <string>

class punto {
private:
	int x;
	int y;
	int z;
	std::string dimension;

public:
	punto(int, int, int);
	punto(int, int);
	punto(int);
	punto();
	int getx();
	int gety();
	int getz();
	std::string getdimension();
	void setx(int);
	void sety(int);
	void setz(int);
	void setdimension(std::string dimension);
	std::string setdimension();
};
