int main(){
	
	int integerA = 1;
    float floatA = 1.1;
    double doubleA = 1.2;
    char letterA = 'a';
    
    int integerB;
    float floatB;
    double doubleB;
    char letterB;
    
    
    
    printf("El valor de nuestro entero A es: %i \n", integerA);
    printf("El valor de nuestro flotante A es: %f \n", floatA);
    printf("El valor de nuestro doble A es: %lf \n", doubleA);
    printf("El valor de nuestro caracter A es: %c \n", letterA);
    
    printf("Ingresa el valor del entero B:");
    scanf(" %i", &integerB);
    printf("Ingresa el valor del flotante B:");
    scanf(" %f", &floatB);
    printf("Ingresa el valor del doble B:");
    scanf(" %lf", &doubleB);
    printf("Ingresa el valor del caracter B:");
    scanf(" %c", &letterB);
    
    printf("El valor de nuestro entero B es: %i \n", integerB);
    printf("El valor de nuestro flotante B es: %f \n", floatB);
    printf("El valor de nuestro doble B es: %f \n", doubleB);
    printf("El valor de nuestro caracter B es: %c \n", letterB);
    
    return 0;
    
}
