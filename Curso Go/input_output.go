package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	nombre := "Brayden"
	edad := 27
	colombiano := true
	cop_to_dollar := 0.00022
	comodin := "puede ser cualquier cosa"

	var edad_leida int
	var nombre_leido string

	fmt.Printf("Mi nombre es %s\n", nombre)
	fmt.Printf("Mi edad es %d\n", edad)
	fmt.Printf("soy colombiano: %t\n", colombiano)
	fmt.Printf("1 Cop equivale a %f usd\n", cop_to_dollar)
	fmt.Printf("el porcentaje v toma el tipo declarado de la variable %v\n", comodin)

	//Opcion 1
	fmt.Println("introduce tu nombre:")
	fmt.Scanf("%s\n", &nombre_leido)
	fmt.Println("introduce tu edad:")
	fmt.Scanf("%d\n", &edad_leida)
	fmt.Printf("¡Hola %s! tienes %d anios.", nombre_leido, edad_leida)

	//opcion 2
	reader := bufio.NewReader(os.Stdin)
	fmt.Println("Igresa tu nombre:")
	nombre_reader, error := reader.ReadString('\n')
	if error != nil {
		fmt.Println(error)
	} else {
		fmt.Printf("¡Hola %s", nombre_reader)
	}
}
