package chap04.section3

fun main() {
    val source = "Hello World!"
    val target = "kotlin"
    println(source.getLongString(target))
}

fun String.getLongString(target: String): String =
        if(this.length > target.length) {
            this
        } else{

            target
        }
