package com.alfonso.androidmaster

fun main(){
    ifBasico("Alfonso")
    ifBasico("Juan")
    esMayorDeEdad(17)
    esMayorDeEdad(18)
}

/**
 * Función para comprobar que la cadena que recibe por parámetro es igual a uno que tenemos
 * establecido en en el código y comprobarlo con la estructura if-else
 */
fun ifBasico(name:String){
    var isName = false;
    if(name == "Alfonso"){
        isName = true;
        println("El nombre es Alfonso $isName")
    }else{
        println("El nombre no es Alfonso $isName es $name")
    }
}

/**
 * Función para comprobar si una persona es mayor de edad o no
 */
fun esMayorDeEdad(edad:Int){
    if(edad >= 18){
        println("Es mayor de edad")
    }else{
        println("No es mayor de edad")
    }
}