#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	
	printf("Operadores de asignacion");
	
	int value;
	
	value=11;
	printf("El valor de nuestra variable es : %i \n", value);
	value += 1;
	printf("El valor de nuestra variable += es : %i \n", value);
	value -= 2;
	printf("El valor de nuestra variable -= es : %i \n", value);
	value *=5;
	printf("El valor de nuestra variable *= es : %i \n", value);
	value /=4;
	printf("El valor de nuestra variable /= es : %i \n", value);
	value %=6;
	printf("El valor de nuestra variable %= es : %i \n", value);
	
	return 0;
}
