package interviewcoding

fun main() {
    val s = "NAmasteCoder"
    val s2 = "namastecoder"

    if (s.equals(s2,ignoreCase = false)){
        println("equal")
    }else{
        println("not equal")
    }
}