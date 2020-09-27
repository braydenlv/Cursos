#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	
	printf("Operadores incremento y decremento\n");
	
	int value, resultado;
	value = 25;
	
	resultado = value++;
	printf("Resultado valor++: %i \n", resultado);
	
	value = 25;
	resultado = ++value;
	printf("Resultado ++valor: %i \n", resultado);
	
	value = 25;
	resultado = value--;
	printf("Resultado valor--: %i \n", resultado);
	
	value = 25;
	resultado = --value;
	printf("Resultado --valor: %i \n", resultado);
	
	return 0;
}
