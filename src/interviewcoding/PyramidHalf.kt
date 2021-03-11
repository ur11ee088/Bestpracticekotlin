package interviewcoding

fun main() {
    val rows =  5

    for (i in rows downTo 1){
        for (k in 1..i){
            print("$k ")
        }
        println()
    }
}