package interviewcoding

fun main() {
    var fact:Long = 1
    for (i in 1..5){
        fact *= i.toLong()
    }

  /*  1*1 = 1
    1*2= 2
    2*2 = 4
    4*3 = 12
    12*4 =48
    48*5 = 120*/

    println("the factorial of 5 is $fact")
}