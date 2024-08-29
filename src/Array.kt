fun main() {
    val name: Array<String> = arrayOf("Syifa", "Haju", "Cans")
    val age: Array<Int> = arrayOf(20, 21, 22, 23)


    println(age.get(1))
    name.set(0, "Bibit") // mengganti value
    println(name[0])
    println(name.get(2)) // mendapatkan data
    println(name.size) // mendapatkan jumlah data

    // Array nullable
    val prodi: Array<String?> = arrayOfNulls(5)
    prodi.set(0, "Informatika")
    prodi.set(1, "Sistem Informasi")
    prodi.set(2, null)
    prodi.set(3, "Teknologi Informasi")
    prodi.set(4, null)

    println(prodi[0])
    for (item in prodi) {
        println(item)
    }

}