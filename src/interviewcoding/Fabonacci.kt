package interviewcoding

class Fabonacci {
}

fun main() {
    val n =5
    var t1 = 0
    var t2 = 1
    println("first $n ")

    for (i in 1..n){
        print("$t1 + ")
        val sum = t1+t2
        t1= t2
        t2 = sum

    }
}