package main

import "fmt"

type User struct {
	edad             int
	nombre, apellido string
}

func main() {
	//var uriel User

	brayden := User{nombre: "Brayden", apellido: "Lopera"} //puede obviar datos
	mara := User{28, "Xiomara", "Gomez"}                   //necesita todos los datos
	mona := new(User)
	mona.nombre = "Estefania"

	fmt.Println(brayden)
	fmt.Println(mara)
	fmt.Println(mona.nombre)

}
