package interviewcoding

fun main() {
    val array = intArrayOf(50,8,7,666,88,999,555)
    var large = array[0]

    for (i in array){
        if (large < i){
            large = i
        }
    }

    print(large)
}