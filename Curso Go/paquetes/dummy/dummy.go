package dummy

var Hola string

func init() {
	Hola = "Hola"
}

func holaMundoPrivado() string {
	return "No me puedes ejecutar externamente"
}

func HolaMundo() string {
	return "Hola mundo"
}
