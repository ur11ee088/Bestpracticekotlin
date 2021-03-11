package interviewcoding

import java.util.*

fun main() {
    val input = Scanner(System.`in`)

    println("enter number ")
    val num = input.nextInt()

    if (num%2==0) println("the num $num is even number")
    else println("the num $num is odd number")

}