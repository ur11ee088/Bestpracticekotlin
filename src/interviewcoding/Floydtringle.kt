package interviewcoding

fun main() {
    val rows = 8
    var no = 1

    for (i in 1..rows){

        for (j in 1..i){
            print("$no, " )
            ++no
        }
        println()
    }
}