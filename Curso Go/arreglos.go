package main

import "fmt"

func main() {
	//var arreglo [3] string
	arreglo := [3]string{"Brayden", "Lopera"}
	arreglo[2] = "Vasquez"

	for i := 0; i < len(arreglo); i++ {
		fmt.Println(arreglo[i])
	}

}
