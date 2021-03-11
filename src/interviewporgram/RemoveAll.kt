package interviewporgram

import java.util.*

class RemoveAll {
}

fun main() {
    val input = Scanner(System.`in`)
    println("enter your string")

    val mString = input.nextLine()

    println("enter the char to remove")

    val removeChar = input.next()[0]

    val spac = mString.replace(removeChar.toString(),"",ignoreCase = true)
     println("after remove string: $spac")


}