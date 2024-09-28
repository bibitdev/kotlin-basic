fun main() {

    val listOfInt = listOf(1, 2, null, 4, null, 6)
    println(listOfInt)

    // Continue
    println("======Continue========")
    for(i in listOfInt) {
        if (i == null) {
            continue
        }
        println(i)
    }

    // Break
    println("======Break========")
    for (j in listOfInt) {
        if (j == null) break
        println(j)
    }

}