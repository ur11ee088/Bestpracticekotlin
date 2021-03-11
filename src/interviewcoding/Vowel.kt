package interviewcoding

class Vowel {
}

fun main() {
    val ch = 'P'

    val v = if (
        ch=='a'
        ||ch=='e'
        ||ch=='i'
        ||ch=='o'
        ||ch == 'u'
        ||ch=='A'
        ||ch=='E'
        ||ch=='I'
        ||ch=='O'
        ||ch == 'U'
    )"Vowel" else "consonant"

    println(v)
}