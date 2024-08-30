fun main() {


    //tailreq ditambahkan ketika error stackoverflow
    tailrec fun display(value: Int) {
        println("Reqursive ke $value")
        if (value > 0) {
            display(value - 1)
        }
    }

    display(100000)
}