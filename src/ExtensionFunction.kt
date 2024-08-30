fun String.hello(): String = "Hello $this"

fun Int.umur(): Unit = println(this)

fun Int.age(): Int = this

fun main() {
    val name = "Raikhan"
    println(name.hello())

    "Syifalita".hello()

    val umur =  21
    println(umur.age())

    22.umur()
}