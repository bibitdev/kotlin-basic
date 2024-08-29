//Constant, biasanya menggunakan UPPER_CASE
const val CONSTANT = "Belajar Kotlin"
const val VERSION = 22.0

fun main() {

    // Mutable = Bisa dirubah
    var mtbl: String = "Mutable"
    mtbl = "Ini adalah Mutable atau bisa diubah"
    // Immutable = Tidak bisa dirubah
    val imtbl = "ini adalah Immutable tidak bisa diubah "
    // imtbl = "Tidak bisa diubah"


    // Null
    val firstName: String? = "Raikhan"
    val lastName: String? = null
    val age = 21

    println("$CONSTANT versi $VERSION")
    println(firstName?.length)
    println(lastName?.length)
    println(age)
    println(mtbl)
    println(imtbl)


}