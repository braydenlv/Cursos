package main

import (
	"net/http"
)

func main() {
	http.HandleFunc("/", func(w http.ResponseWriter, r *http.Request) {
		http.ServeFile(w, r, "index.html")
		//http.ServeFile(w, r, r.URL.Path[1:]) //con este metodo se puede acceder a cualquier archivo ya que toma todo el path y lo busca dentro de la carpeta de ejecución
	})

	http.ListenAndServe(":8000", nil)
}
