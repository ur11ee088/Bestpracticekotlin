package interviewcoding

class SwapNumber {
}

fun main() {
    var a = 10
    var b = 20

   println("----before swap--------")
   println("----value of a : $a")
   println("----value of b : $b")

    a= a-b // a = 10-20 = -10
    b= a+b // b = -10+20 = 10
    a = b-a // a = 10+10 = 20
    println("----after  swap--------")
    println("----value of a : $a")
    println("----value of b : $b")




}