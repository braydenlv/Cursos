package main

import "fmt"

func main() {
	x := 10
	y := 5
	/*
		== igual a
		!= diferente de
		< menor que
		> mayor que
		<= menor igual que
		>= mayor igual que
		&& AND
		|| OR
	*/
	if x > y {
		fmt.Printf("%d es mayor que %d", x, y)
	} else if y > x {
		fmt.Printf("%d es mayor que %d", y, x)
	} else {
		fmt.Printf("%d y %d son iguales", y, x)
	}
}
