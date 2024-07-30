package com.alfonso.androidmaster

fun main(){
    getTrimestre(16)
    getTrimestre(5)

    resultado(12)
    resultado("Alfonso")
    resultado(true)
}

/**
 * Función para obtener el trimestre de un mes
 */
fun getTrimestre(month: Int){
    when(month){
        1,2,3 -> println("Primer trimestre")
        4,5,6 -> println("Segundo trimestre")
        7,8,9 -> println("Tercer trimestre")
        10,11,12 -> println("Cuarto trimestre")
        else -> println("Mes incorrecto, no existe el mes $month")
    }
}

/**
 * Función para obtener el semestre de un mes utilizando rangos
 * y controlando que si es un mes fuera del rango 1-12 se muestre un mensaje de error negando el in con !
 */
fun getSemestre(month: Int){
    when(month){
        in 1..6 -> println("Primer semestre")
        in 7..12 -> println("Segundo semestre")
        !in 1..12 -> println("Mes incorrecto, no existe el mes $month")
    }

}

/**
 * Función para obtener el resultado de una variable de cualquier tipo
 */
fun resultado(value:Any){
    when(value){
        is Int -> println("Es un entero $value + $value")
        is String -> println("Es un string")
        is Boolean -> if(value) println("Es un booleano") else println("No es un booleano")
    }
}