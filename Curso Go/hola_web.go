package main

import (
	"io"
	"net/http"
)

func main() {
	http.HandleFunc("/", hola_mundo)
	http.HandleFunc("/hola", hola)
	http.ListenAndServe(":8000", nil)
}

func hola_mundo(w http.ResponseWriter, r *http.Request) { //w es un string de datos
	io.WriteString(w, "Hola mundo")
}

func hola(w http.ResponseWriter, r *http.Request) { //w es un string de datos
	io.WriteString(w, "Hola!")
}
