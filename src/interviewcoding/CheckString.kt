package interviewcoding

fun main() {
    val str1 : String? = "hds"

    val str2 = "hi"

    if (isNullorEmpty(str1)) println("null or empty")
    else println("not null or not empty")

    if (isNullorEmpty(str2)) println("null or empty")
    else println("not null or not empty")

}

fun isNullorEmpty(s:String?):Boolean{
    if (s!=null && !s.isEmpty())
        return false
    return true
}