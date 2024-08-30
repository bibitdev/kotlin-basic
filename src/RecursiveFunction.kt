fun forLoop(value: Int): Int {
    var result = 1
    for (i in value downTo 1) {
        result *= i
    }
    return result
}

fun forRecursive(nilai: Int): Int {
    return when (nilai) {
        1 -> 1
        else -> nilai * forRecursive( nilai-1 )
    }
}

fun main() {
    println(forLoop(5))
    println(forRecursive(10))
}