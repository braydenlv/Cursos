package main

import "fmt"

func main() {
	slice := make([]int, 3, 5) //tipo elemento, tamaño, capacidad
	slice = append(slice, 2)   //append agrega un nuevo elemento cambiando el tamaño
	fmt.Println(cap(slice))
}
