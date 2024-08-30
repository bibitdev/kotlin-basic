infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.uppercase()
    } else {
        return this.lowercase()
    }
}


fun main() {
    var result: String = "raikhan" to "UP"
    println(result)
}