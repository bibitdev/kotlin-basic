fun main() {
    fun hello(name: String, transformer: (String) -> String ): String {
        val nameTransform = transformer(name)
        return  "Hello $nameTransform"
    }

    val lamdaUpper = {value: String -> value.uppercase()}
    println(hello("raikhan", lamdaUpper))

    println(hello("azzaki", {value: String -> value.lowercase()}))
    
}