package interviewcoding

fun main() {
    val arrray = intArrayOf(10,20,30,50)
    var sum = 0

    for (i in arrray){
        sum += i
    }

    val avg = sum/arrray.size

    println("the sum of array is $sum and avg is $avg")
}