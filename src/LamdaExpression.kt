
//val lambdaName: (parameterType) -> returnType = { parameters -> body }


// method references
fun toUpper(value: String): String = value.uppercase()


fun main() {

    // lamba
    val exmLamda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }
    val result = exmLamda("Syifa", "hadju")
    println(result)
    println(exmLamda("Ewkharis", "Kayes"))


    // it
    val lamdaName: (String) -> String = {
        it.uppercase() // it digunakan ketika parameter hanya 1
    }

    val nama = lamdaName("gldin")
    println(nama)

    val greet: (String) -> String = {
        "Hello $it"
    }
    println(greet("Baby"))

    //method references
    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("jeha anais"))

}