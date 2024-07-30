package com.alfonso.androidmaster

fun main(){
    var resultado = sumar(10,5)
    println("El resultado de la suma es: $resultado")
    resultado = resta(10,5)
    println("El resultado de la resta es: $resultado")
    resultado = multiplicacion(10,5)
    println("El resultado de la multiplicación es: $resultado")
    resultado = division(10,5)
    println("El resultado de la división es: $resultado")

    var resultadoDecimales = sumarDecimales(10.5,5.5)
    println("El resultado de la suma de decimales es: $resultadoDecimales")
    resultadoDecimales = restarDecimales(10.5,5.5)
    println("El resultado de la resta de decimales es: $resultadoDecimales")
    resultadoDecimales = multiplicarDecimales(10.5,5.5)
    println("El resultado de la multiplicación de decimales es: $resultadoDecimales")
    resultadoDecimales = divisionDecimales(10.5,5.5)
    println("El resultado de la división de decimales es: $resultadoDecimales")
}

/**
 * Función para sumar dos números enteros
 */
fun sumar(num1: Int, num2: Int): Int{
    println("Suma: $num1 + $num2")
    return num1 + num2
}

/**
 * Función para restar dos números enteros
 */
fun resta(num1: Int, num2: Int): Int{
    println("Resta: $num1 - $num2")
    return num1 - num2
}

/**
 * Función para multiplicar dos números enteros
 */
fun multiplicacion(num1: Int, num2: Int): Int{
    println("Multiplicación: $num1 * $num2")
    return num1 * num2
}

/**
 * Función para dividir dos números enteros
 */
fun division(num1: Int, num2: Int): Int{
    println("División: $num1 / $num2")
    return num1 / num2
}

/**
 * Función para sumar dos números decimales
 */
fun sumarDecimales(num1: Double, num2: Double): Double{
    println("SumaDecimales: $num1 + $num2")
    return num1 + num2
}

/**
 * Función para restar dos números decimales
 */
fun restarDecimales(num1: Double, num2: Double): Double{
    println("RestaDecimales: $num1 - $num2")
    return num1 - num2
}

/**
 * Función para multiplicar dos números decimales
 */
fun multiplicarDecimales(num1: Double, num2: Double): Double{
    println("MultiplicaciónDecimales: $num1 * $num2")
    return num1 * num2
}

/**
 * Función para dividir dos números decimales
 */
fun divisionDecimales(num1: Double, num2: Double): Double{
    println("DivisiónDecimales: $num1 / $num2")
    return num1 / num2
}