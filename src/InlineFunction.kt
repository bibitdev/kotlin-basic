inline fun hello(
    Inline: () -> String,
    noinline NoInline: () -> String,
): String {
    return "Function ${Inline()} ${NoInline()}"
}

fun main() {
    for (i in 0..20) {
        println(hello({"Inline"}, {"NoInline"}))
    }
}