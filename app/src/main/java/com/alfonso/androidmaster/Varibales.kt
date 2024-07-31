package com.alfonso.androidmaster

fun main(){

    //Funcion para mostrar valores por pantalla
    println("Hola Kotlin")

    /**
     * Variables de tipo texto
     */
    //Declaramos variable del tipo texto por defecto Kotlin deduce el tipo de dato
    var name1 = "Alfonso1"
    //Declaramos variable del tipo texto indicando el tipo de dato que va a tener la variable
    var name2:String = "Alfonso2"

    println(name1);
    println(name1);

    /**
     * Variables numericas
     */
    //Declaramos variable del tipo entero por defecto Kotlin deduce el tipo de dato
    var num1 = 10
    //Declaramos variable del tipo entero indicando el tipo de dato que va a tener la variable
    var num2:Int = 2
    //Declaramos variable del tipo Long indicando el tipo de dato que va a tener la variable
    var example:Long = 1234567890
    //Declaramos variable del tipo Float indicando el tipo de dato que va a tener la variable
    var floatExample:Float = 1.5f

    println(num1)
    println(num2)
    println(example)
    println(floatExample)

    /**
     * Variables de tipo char
     */
    //Declaramos variable del tipo char indicando el tipo de dato que va a tener la variable
    var charExample:Char = 'a'
    println(charExample)


    /**
     * Variables booleanas
     */
    //Declaramos variable del tipo booleano indicando el tipo de dato que va a tener la variable
    var booleanExample:Boolean = true
    println(booleanExample)

    /**
     * Variables de tipo array
     */
    val miArray:ArrayList<String> = arrayListOf<String>("Alfonso","Juan","Pedro")
    //Bucle para recorrer todas las posiciones del Array
    miArray.forEachIndexed { indice, nombre ->
        println("Nombre en la posición $indice: $nombre")
    }

    /**
     * Funciones ariméticas
     */
    println("Suma: ${num1+num2}")
    println("Resta: ${num1-num2}")
    println("Multiplicación: ${num1*num2}")
    println("División: ${num1/num2}")

}