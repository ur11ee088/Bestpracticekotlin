package interviewcoding

import java.util.*

fun main() {

    val  input = Scanner(System.`in`)

    println("enter a string ")

    val myString= input.nextLine()

    if (isPalindromeString(myString)){
        println("the $myString  is Palindrome")
    }else{
        println("the $myString  is  not a Palindrome")

    }

}


fun  isPalindromeString(s:String):Boolean{
    val sb = StringBuilder(s)
    val rvString = sb.reverse().toString()
    return s.equals(rvString,ignoreCase = true)
}