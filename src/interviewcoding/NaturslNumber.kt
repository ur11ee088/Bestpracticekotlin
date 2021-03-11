package interviewcoding

fun main() {
    var sum = 0

    for (i in 1..5){
        sum +=i
    }
   /*
    0+1 = 1
    1+2= 3
    3+3=6
    6+4 = 10
    10+5 = 15*/

    println("the sum of natural number is $sum")
}