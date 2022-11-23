package main

import "fmt"

func main() {
	/*
		1. Un puntero es una dirección de memoria
		2. En lugar del valor se tiene la dirección de memoria donde está el valor
		3. Sirve para modificar el dato sin modificar la variable
		4. El valor zero de un puntero es nulo (nil)
		5. Se llama con *TipoDeVariable (*int, *string, *Struct)
		6. Se asigna con &NombreDeLaVariable
		7. Se accede al valor con *NombreDelPuntero

	*/

	var punteroUno, punteroDos *int

	entero := 5

	punteroUno = &entero
	punteroDos = &entero

	fmt.Println(punteroUno) //imprime la direccion de memoria
	fmt.Println(punteroDos)

	*punteroUno = 6

	fmt.Println(*punteroDos) //imprime el valor

}
