package interviewporgram

import java.util.*

class FindtheFrequecny {
}

fun main() {
    var input = Scanner(System.`in`)
    println("enter the sentance")
    val inputString = input.nextLine()

    println("enter the char")
    val countChar = input.next()[0]
    var count:Int = 0

    for ( a in inputString.indices){
        if (countChar==inputString[a]){
            count++
        }

    }
    println("the frequency of the char is $count")

}