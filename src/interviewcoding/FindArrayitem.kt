package interviewcoding

fun main() {
    val a = intArrayOf(8,9,6,4,0,2,77,55,44,33,878,454,92,99)
    val find = 3
    var found :Boolean = false

    for (i in a){
        if (i == find){
            found = true
            break
        }
    }

    if (found){
        println("the array item $find is found")
        }else  println("the array item $find not found")
}