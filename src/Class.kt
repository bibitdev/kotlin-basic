class Animal() {
    var name: String = "Kucing"
    var weight: Int = 20
    var isMamalia: Boolean = true

    fun eat() {
        println("$name Makan!")
    }

    fun sleep() {
        println("$name Tidur!")
    }
}

class User(val name: String) {
    fun userName() {
        println(name)
    }
}

fun main() {

    val user = User("Dicoding")
    user.userName()

    println("============")

    val peliharaan = Animal()
    println("Nama ${peliharaan.name}, Berat ${peliharaan.weight}, Mamalia ${peliharaan.isMamalia}")
    peliharaan.eat()
    peliharaan.sleep()

    println("============")
    // Mengubah properti
    peliharaan.name = "Kementol"
    peliharaan.weight = 5
    peliharaan.isMamalia = false
    println("Nama ${peliharaan.name}, Berat ${peliharaan.weight}, Mamalia ${peliharaan.isMamalia}")
    peliharaan.eat()
}
