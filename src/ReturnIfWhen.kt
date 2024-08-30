// if
fun sayHello1(name: String = ""): String {
    return if (name == "") {
        "Hello Bro!"
    } else {
        "Hello $name!"
    }
}

// when
fun sayHello2(nama: String = ""): String{
    return when(nama) {
        "" -> "Hello Cuy!"
        else -> "Hai $nama!"
    }
}

fun main() {
    println(sayHello1())
    println(sayHello1("Raikhan"))

    println(sayHello2())
    println(sayHello2("Najwa"))
}