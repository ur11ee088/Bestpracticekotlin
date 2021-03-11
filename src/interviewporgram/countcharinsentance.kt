package interviewporgram

import java.util.*
import kotlin.collections.HashMap

class countcharinsentance {
}

fun main() {
    val input = Scanner(System.`in`)
    println("enter the sentance")

    var str = input.nextLine()

    val mHashmap: HashMap<Char,Int> = HashMap()
    var mChar: Char

    for (a in str.indices){
        mChar = str[a]
        if (mHashmap.containsKey(mChar)){
            mHashmap[mChar] = mHashmap[mChar]!!+1
        }else{
            mHashmap[mChar] = 1
        }

    }
    println("the all char count is : $mHashmap")




}