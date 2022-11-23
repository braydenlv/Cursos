package main

import (
	"fmt"
	"strconv"
)

func main() {
	edad := 22
	edad_str := strconv.Itoa(edad)

	//la variable _ significa que se puede desechar, es debido a que el metodo Atoi puede retornar multiples objetos, en este caso el entero y el error si se presenta
	edad_int, _ := strconv.Atoi(edad_str)

	edad_int = edad_int + 10
	edad_str = strconv.Itoa(edad_int)

	fmt.Println("mi edad es: " + edad_str)
}
