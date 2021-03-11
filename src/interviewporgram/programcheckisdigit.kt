package interviewporgram

import java.util.*

class programcheckisdigit {
}

fun main() {

    val input = Scanner(System.`in`)
    print("enter the input")
    val mChar = input.next()[0]

    when{
        mChar.isLetter()->
            println("it is a alphabet")
        mChar.isDigit() ->
            println("it is digit")
        else-> println("special charachter")

    }


}