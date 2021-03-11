package interviewcoding

fun main() {
    var sentance = "hi i 382 am learning program 723 "

    var vowels = 0
    var const = 0
    var digit = 0
    var space = 0

    sentance = sentance.toLowerCase()

    for (i in 0..sentance.length-1){
        val ch = sentance[i]
        if ( ch=='a'
            ||ch=='e'
            ||ch=='i'
            ||ch=='o'
            ||ch == 'u'){
            ++vowels
        }
        else if (ch in 'a'..'z'){
            ++const
        }else if (ch in '0'..'9'){
            ++digit
        }else if (ch ==' '){
            ++space
        }
    }
    println("vowels $vowels")
    println("const $const")
    println("digit $digit")
    println("space $space")
}