package interviewcoding

fun main() {

    val otp = genrating4digitOTP()
    println("the otp is : $otp")

}

fun genrating4digitOTP():String{
    val pin = (Math.random()*9000).toInt()+1000
    return pin.toString()
}