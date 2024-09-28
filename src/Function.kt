// Function

// Penulisan function
/*
    fun (param1: TypeData, param2: TypeData): return type {
    return result
    }
**/
fun helloWorld() {
    println("Hello World")
    println("Let's Learn Kotlin")
}

// Function Parameter
fun sayHello(firstName: String, lastName: String) {
    println("Hello $firstName $lastName")
}

//Function default parameter
fun greet(namaDepan: String, namaBelakang: String? = null) {
    if (namaBelakang == null) {
        println("Hello $namaDepan")
    } else {
        println("Hello $namaDepan $namaBelakang")
    }
}

//Function Name Argument
fun fullName(fnm: String, mdlnm: String, lstnm: String) {
    println("WOI $fnm $mdlnm $lstnm")
}

// Function return type
fun sum(a: Int, b: Int): Int {
    val total = a + b
    return total
}


// Single expression function
fun single(a: Int): Int = a * 2
fun sapa(nama: String): Unit = println("Hello $nama")



// Vararg atau variabel arguments note:harus dipaling akhir
fun hitungJumlah(vararg values: Int): Int {
    var jumlah = 0
    for (value in values) {
        jumlah += value
    }
    return jumlah;
}


fun main() {

    helloWorld() // Function
    sayHello("Raikhan", "Friskha") // Function Parameter
    greet("Syifa", "Cans")  //Function default parameter
    greet("Raikhan") //Function default parameter

    println(
        fullName(
            fnm = "Bibit",    //Function Name Argument
            lstnm = "Azzaki",
            mdlnm = "Raikhan"
        )
    )

    println(sum(10, 20))      // Function return type
    val result1 = sum(20, 200)  // bisa juga ditampung dgn variabel
    val result2 = sum(20, 300)
    println(result1)
    println(result2)


    println(single(20))  // Single expression function
    sapa("Msbreewx")   // Single expression function


    val hasil = println(hitungJumlah(10, 20, 30, 40 , 50)) //varargs
}