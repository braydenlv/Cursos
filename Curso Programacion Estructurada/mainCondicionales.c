#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	
	printf("Condicionales");
	
	float valorA,valorB, valorC;
	valorA=valorB=100;
	
	printf("Primera condicion\n");
	
	if (valorA==valorB){
		printf("Ambos son iguales\n");
	}
	
	printf("Segunda condicion\n");
	
	if (valorA==valorB){
		printf("Ambos son iguales\n");
		valorC=valorA+valorB;
		printf("La suma de ambos numeros es: %f\n", valorC)
	}
	
	return 0;
}
