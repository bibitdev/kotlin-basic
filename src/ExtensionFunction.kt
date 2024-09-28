fun String.hello(): String = "Hello $this"

fun Int.umur() = println(this)

fun Int.age(): Int = this

fun main() {
    // Memanggil fungsi ekstensi untuk String
    val name = "Raikhan"
    println(name.hello())   // Output: Hello Raikhan

    // Fungsi ekstensi dipanggil tanpa menyimpan hasilnya
    println("Syifalita".hello())  // Output: Hello Syifalita

    // Memanggil fungsi ekstensi untuk Int
    val umur = 21
    println(umur.age())  // Output: 21

    // Fungsi ekstensi untuk Int langsung dipanggil tanpa variabel
    22.umur()  // Output: 22
}
