package functionsExercise

fun string(value: String): String {
    println("value: ${value.length}")
    return value
}

fun stringAndQuantity(value: String): String {
    println("A String - $value - possui - ${value.length} caracteres.")
    return value
}

fun main() {
    string("teste")
    stringAndQuantity("teste 2")
}