fun main() {

    val finalExam = 'A'
    when (finalExam) {
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Nice")
        'D' -> println("Bad")
        'E' -> println("Try next year")
    }

    //Atau bisa juga langsung
    when (finalExam) {
        'A', 'B', 'C' -> println("You completed")
        else -> {
            println("Try next semester")
        }
    }

    // Use in and !in
    var nilaiUjian = "E"
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when (nilaiUjian) {
        in nilaiLulus -> println("CONGRATS YOU PASSED")
        !in nilaiLulus -> println("TRY NEXT SEMESTER")
    }


    // Cek Tipe Data
    val cekTipeData = "Elzan"
    when(cekTipeData) {
        is String -> println("TIPE DATA STRING")
        !is String -> println("BUKAN TIPE STRING")
    }

    // When pengganti if else
    val valueExamp = 20
    when{
        valueExamp > 80 -> println("GOOD JOB")
        valueExamp > 60 -> println("NOT BAD")
        valueExamp > 40 -> println("NOOB")
        else -> println("TRY AGAIN")
    }
}