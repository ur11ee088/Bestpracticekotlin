package interviewcoding

fun main() {
    val str = "namaste coder consonants \n" +
            "Remove all spaces from string\n" +
            "Search item in array\n" +
            "Check string is null or empty \n" +
            "Compare two strings\n"

    val ch ='c'

    var noofsize = 0

    for (i in 0..str.length-1){
        if (ch==str[i]){
            ++noofsize
        }
    }

    print("the total no of $ch : "+noofsize)

}