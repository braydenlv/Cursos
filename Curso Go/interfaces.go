package main

import "fmt"

type Persona interface {
	Hablar() string
	Caminar() bool
	Nombre() string
}

type Capacidad struct {
	hablar string
	nombre string
}

func (capacidad Capacidad) Hablar() string {
	return capacidad.hablar
}

func (capacidad Capacidad) Caminar() bool {
	return true
}

func (capacidad Capacidad) Nombre() string {
	return capacidad.nombre
}

func hacer(persona Persona) string {
	if persona.Caminar() {
		return persona.Nombre() + " Caminando"
	} else {
		return persona.Nombre() + " No camina"
	}
}

func main() {
	persona_uno := Capacidad{nombre: "Brayden"}

	fmt.Println(hacer(persona_uno))

	personas := []Persona{Capacidad{nombre: "Estefania", hablar: "Bla bla"}, Capacidad{nombre: "Xiomara", hablar: "Bla bla bla"}}

	for _, persona := range personas {
		fmt.Println(hacer((persona)))
	}

}
