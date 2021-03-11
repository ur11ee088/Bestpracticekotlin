package interviewcoding

fun main() {
    var sent = "hi i am learning program"
    println("before remove $sent")

    sent = sent.replace("\\s".toRegex(),"")
    println("after remove $sent")


}