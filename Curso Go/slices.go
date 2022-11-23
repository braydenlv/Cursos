package main

import "fmt"

func main() {

	//var matriz [] int //slice porque no tiene tamaño

	matriz := []int{1, 2, 3}

	fmt.Println(matriz)

	arreglo := [3]int{1, 2, 3}
	slice := arreglo[:2] //slicing
	fmt.Println(slice)

	//los slice tiene tres datos:
	//* puntero al arreglo
	//* Longitud del arreglo al que apunta
	//* Capacidad

}
