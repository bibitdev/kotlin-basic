fun main() {


    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val upper = fun(value: String): String {
        if (value == "") {
            return "UPS"
        } else {
            return value.uppercase()
        }
    }
    println(hello("raikhan", upper))
    println(hello("", upper))

    // anonymous as parameter
    println(hello("syifalita", fun(value: String): String {
        return value.lowercase()
    }))

}