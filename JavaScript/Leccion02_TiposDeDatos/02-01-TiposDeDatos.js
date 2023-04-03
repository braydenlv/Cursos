/*
Ejemplos de tipos de datos JavaScript
*/

//Tipo de dato String
var nombre = "Brayden";
console.log(nombre);

//Tipo de dato number
var numero = 27;
console.log(numero);

//tipo de dato object
//Lo que hay dentro de las llaves {} son propiedades del objeto, se separan por comas(,)
var objeto =  {
    nombre: "Mara",
    apellido: "Gomez",
    telefono: 32145698
}
console.log(objeto);

//tipo de dato boolean(true, false)
var bandera = true;
console.log(bandera);

//Tipo de dato funtion
function miFuncion(){}
console.log(miFuncion);

//Tipo de dato Symbol, se utiliza para crear valores unicos de una variable
var simbolo = Symbol("mi simbolo");
console.log(simbolo);

//tipo clase (es una funcion)
class Persona{
    constructor(nombre, apellido){
        this.nombre= nombre;
        this.apellido;
    }
}
console.log(Persona);

//Tipo de dato undefine, este dato tambien se puede asignar directamente
var x;
console.log(x);
x = undefined;
console.log(x)

//null (ausencia de valor) no es un tipo de dato, es un tipo object
var y = null;
console.log(y);
console.log(typeof y);

//Las variables son dinamicas
var generica;
generica = "Soy un String";
console.log(typeof generica);
generica = 23;
console.log(typeof generica);
generica = 5.4;
console.log(typeof generica);
generica = {
    nombre: "Brayden",
    apellido: "lopera"
}
console.log(typeof generica);
generica = false;
console.log(typeof generica);

var autos = ['BMW','Audi','Volvo'];
console.log(autos);
console.log(typeof autos);

var z = '';
console.log(z);
console.log(typeof z);

var nombre = 'Brayden';
var apellido = 'Lopera';

var nombreCompleto = nombre + ' ' + apellido;
console.log(nombreCompleto);

var nombreCompleto2 = 'Xiomara' + ' ' + 'Gomez';
console.log(nombreCompleto2);

var x = nombre + 2 + 19;
console.log(x);

var xx = nombre + (2 + 4);
console.log(xx);

xx = 2 + 4 + nombre;
console.log(xx);
