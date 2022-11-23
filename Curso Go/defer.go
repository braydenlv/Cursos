package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	read_file()
}

func read_file() bool {
	archivo, err := os.Open("./hola.txt")
	defer archivo.Close() //siempre se debe de cerrar el archivo pero si existe una condición que lo impida el defer lo cerrara no importa donde haya parado la funcion

	if err != nil {
		fmt.Println("Hubo un error")
	}

	scanner := bufio.NewScanner(archivo)
	var i int
	for scanner.Scan() {
		i++
		linea := scanner.Text()
		fmt.Printf("linea %v: ", i)
		fmt.Println(linea)
	}

	if true {
		return true
	}

	fmt.Println("Esto nunca se ejecuta")
	return true
}
