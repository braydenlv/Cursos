package main

import "fmt"

type Usuario struct {
	edad             int
	nombre, apellido string
}

func (usuario Usuario) nombre_completo() string {
	return usuario.nombre + " " + usuario.apellido
}

func (usuario *Usuario) set_nombre(nombre string) {
	usuario.nombre = nombre
}

func main() {
	//var uriel Usuario

	brayden := Usuario{nombre: "Brayden", apellido: "Lopera"} //puede obviar datos
	mara := Usuario{28, "Xiomara", "Gomez"}                   //necesita todos los datos
	mona := new(Usuario)
	mona.nombre = "Estefania"
	mona.set_nombre("Mona")

	fmt.Println(mara)
	fmt.Println(mona.nombre)
	fmt.Println(brayden.nombre_completo())

}
