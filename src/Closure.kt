fun main() {
    var counter: Int = 0

    val lamdaIncrement = {
        println("lamda increment")
        counter++
    }

    val anonymousIncrement = fun() {
        println("Anonymous Increment Function")
        counter++
    }

    fun functionIncrement() {
        println("Function Increment")
        counter++
    }

    lamdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lamdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)

}