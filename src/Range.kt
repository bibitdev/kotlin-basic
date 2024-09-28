fun main() {

    val jarak = 1..10
    for(i in jarak) {
        println("jarak $i")
    }

    val range = 0..99
//    val range = 100 downTo 2
//    val range = 100 downTo 2 step 5

    println(range.count()) // jumlah value
    println(range.contains(50)) // cek apakah value tsb ada
    println(range.contains(200)) // cek apakah value tsb ada
    println(range.first) // value awal
    println(range.last) // value akhir
    println(range.step) // mendapatkan nilai tiap kenaikan

}