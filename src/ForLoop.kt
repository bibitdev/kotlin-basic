fun main() {

    var array = arrayOf("Bibit", "Raikhan", "Azzaki", "Syifa", "Haju", "Anjay")

    var total = 0

    for (name in array) {
        println(name)
        total++
    }
    println("Total value adl = $total")

    for(i in 0..10)
        println(i)

    println("======= For Range ======")

    var arrayLenght = array.size -1
    for (l in 0..arrayLenght) {
        println("Index $l = ${array.get(l)}")
    }

    println("--------For Range---------")
    for (value in 100 downTo 0 step 20) {
        println(value)
    }


}