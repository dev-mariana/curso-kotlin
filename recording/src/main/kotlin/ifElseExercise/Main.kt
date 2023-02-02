package ifElseExercise

fun printLargestNumber(a: Int, b: Int) {
    if(a > b) {
        println(a)
    } else if(b > a) {
        println(b)
    } else {
        println("Valores Iguais.")
    }
}

fun totalPineapples(amount: Int) {
    var totalPrice: Double

    if(amount >= 10) {
        totalPrice = amount * 2.0
        println("O valor é: $totalPrice")
    } else {
        totalPrice = amount * 3.0
        println("O valor é: $totalPrice")
    }
}

fun rankingFighters(category: String) {
    when (category) {
        "Pena" -> {
            println("Menos de 57kg")
        }
        "Leve" -> {
            println("Mais de 57kg e menos de 61kg")
        }
        "Médio" -> {
            println("Mais de 61kg e menos de 73kg")
        }
        "Pesado" -> {
            println("Igual ou acima de 73kg")
        }
        else -> {
            println("Categoria Desconhecida")
        }
    }
}

fun pairNumbers() {
    for (i in 100..200 step 2) {
        print("$i ")
    }
}

fun reverse(str: String) {
    var size = str.length

    while(size > 0) {
        println(str[size - 1])
        size--
    }
}

fun printNumbers(n1: Int, n2: Int, ascending: Boolean) {
    if(ascending) {
        var count = n1

        while(count <= n2) {
            print("$count ")
            count++
        }
    } else {
        var count = n2

        while(count >= n1) {
            print("$count ")
            count--
        }
    }
}

private fun escreveEscada(n: Int): String {
    var str = ""
    var contador = 1
    var i = 0
    var j = 0

    while(i < n) {
        i++
        while(j < contador) {
            str += "#"
            j++
        }
        contador++
        str += "\n"
        j = 0
    }

    print("$str")
    return str
}

fun main() {
//    1 e 2
//    printLargestNumber(7, 6)
//    3
//    totalPineapples(11)
//    4
//    rankingFighters("Médio")
//    pairNumbers()
//    reverse("Mariana")
//    printNumbers(10, 22, false)
    escreveEscada(3)
}

