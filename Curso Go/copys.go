package main

import "fmt"

func main() {

	/*
		La funcion copy copia el minimo de elementos en ambos arreglos
	*/

	slice := []int{1, 2, 3, 4}
	copia := make([]int, len(slice), cap(slice)*2) //se duplica la capacidad para que no reconstruya un nuevo slice impactando los tiempos de ejecución
	copy(copia, slice)
	fmt.Println(slice)
	fmt.Println(copia)

}
