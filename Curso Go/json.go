package main

import (
	"encoding/json"
	"net/http"
)

type Curso struct {
	Title        string `json:"title"` //Se le da formato con ``
	NumeroVideos int    `json:"numero_videos"`
	horas        int    //Al no empezar en mayúscula Go lo toma como atributo privado y no lo muestra en el json
}

type Cursos []Curso

func main() {
	http.HandleFunc("/", func(w http.ResponseWriter, r *http.Request) {
		cursos := Cursos{
			Curso{"Curso de Go", 30, 60},
			Curso{"Curso de Java", 40, 80},
			Curso{"Curso de Python", 35, 70}, //El ultimo tambien tiene que llevar ,
		}
		json.NewEncoder(w).Encode(cursos)
	})

	http.ListenAndServe(":8000", nil)
}
