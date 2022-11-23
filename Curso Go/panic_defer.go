package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	read()
	fmt.Println("Esto no se ejecuta por el panic. Si se ve, hay un recover")
}

func read() bool {
	archivo, err := os.Open("../hola.txt")
	//defer archivo.Close() //siempre se debe de cerrar el archivo pero si existe una condición que lo impida el defer lo cerrara no importa donde haya parado la funcion

	defer func() {
		archivo.Close()
		recover() // el recover detiene el panic y hace que el programa siga "ignorandolo"
	}()

	if err != nil {
		panic(err) //lanza un error, detiene la ejecución
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
