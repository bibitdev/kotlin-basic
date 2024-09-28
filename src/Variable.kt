//Constant, biasanya menggunakan UPPER_CASE
const val CONSTANT = "Belajar Kotlin"
const val VERSION = 22.0

// Penulisan variable
  /*
        val/var namaVariable : TipeData = Isi(value)
  */

fun main() {

    // Variable
    println("Hello Kotlin!")
    val nama: String = "Dicoding!"
    val price: Int = 100
    println("Course in $nama with price $price$")

    // Null
    val firstName: String? = "Raikhan"
    val lastName: String? = null
    val age = 21
    println(firstName?.length)
    println(lastName?.length)
    println(age)

    // Safe call operator ?.
    val safeCall : String? = null
    println(safeCall?.length)

    // Elvis operator ?:
    val elvis : String? = null
    println(elvis?.length ?: 0)

    // Collection

    // List
    val intList = listOf(1, 2, 3, 4, 5)
    println(intList)
    // Set = untuk menentukan nilai unik atau nilai yg sama tidak di uylang
    val intSet = setOf(1, 2, 3, 1, 3, 4, 5)
    println(intSet)
    // Map -> format key to value
//    val kota = mapOf(
//        "Jakarta" to "Indonesia",
//        "Karangkobar" to "Banjarnegara",
//        "Purwokerto" to "Banyumas"
//    )
//    println(kota)

    // Mutable list
    val anyList = mutableListOf(1, "hello", 20, true)
    anyList.add("dicoding") // menambahkan item
    anyList.add(1, "academy") // menambahkan item pada index 1
    anyList.removeAt(0) // Menghapus index ke 0
    anyList[3] = false // mengubah index ke-4 menjadi false
    println(anyList)

    var value = 1
    value += 2
    println(value)
}