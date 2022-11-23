package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	archivo, err := os.Open("./hola.txt")

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

	archivo.Close()
}
