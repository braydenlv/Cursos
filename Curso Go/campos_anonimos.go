package main

import "fmt"

type Human struct {
	nombre string
}

type Dummy struct {
	nombre string
}

type Tutor struct {
	Human
	Dummy
}

func (human Human) hablar() string {
	return "bla bla bla"
}

func main() {
	tutor := Tutor{Human{"Brayden"}, Dummy{"Steven"}}
	fmt.Println(tutor.Human.nombre)
	fmt.Println(tutor.hablar())
}
