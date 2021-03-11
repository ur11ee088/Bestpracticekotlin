package interviewporgram

import java.lang.StringBuilder
import java.util.*

class counttheword {
}

fun main() {
     var  count : Int = 0
    val input = Scanner(System.`in`)
    println("enter the string")

    val str = input.nextLine()

    val srtArray = str.split(" ".toRegex()).toTypedArray()


    for (a in srtArray ){
        if (a.isNotEmpty()){
            count++
        }
    }

    println("the count of words are: $count")




}