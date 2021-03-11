package interviewcoding

fun main() {
    val row = 4
    var num = 1
    for (i in 1..row){
        for (j in 1..i){
            print(num)
            ++num
        }
        //println()
    }
}