package main

import (
	"fmt"
	"strings"
	"time"
)

func main() {
	go mi_nombre_lento("Brayden") //si se antepone un go se convierte en una gorutine convirtiendose en asincronico o sea se vuelve concurrente
	fmt.Println("Me duermo esperando zzzZZZ")
	var wait string
	fmt.Scanln(&wait)
}

func mi_nombre_lento(nombre string) {
	letras := strings.Split(nombre, "") //Split separa los caracteres que se recibe en el primer parametro y los separa con el segundo parametro

	for _, letra := range letras {
		time.Sleep(1000 * time.Millisecond)
		fmt.Printf(letra)
	}
}
