package interviewcoding

fun main() {
    val sentence = "namaste coder"
    // redoc
    val fn = rev(sentence)
    println(fn)
}

fun rev(s:String):String{
    if (s.isEmpty()){
        return  s
    }

    return rev(s.substring(1))+s[0]
}