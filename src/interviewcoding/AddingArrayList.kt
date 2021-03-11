package interviewcoding

fun main() {
    val aList1 = ArrayList<String>()
    aList1.add("a")
    aList1.add("b")
    aList1.add("c")
    println("the list one data is $aList1")

    val bList2 = ArrayList<String>()
    bList2.add("d")
    bList2.add("e")
    bList2.add("f")
    bList2.add("g")

    println("the list two data is $bList2")


    val addBothArrayList = ArrayList<String>()
    addBothArrayList.addAll(aList1)
    addBothArrayList.addAll(bList2)

    println("the list adding data is $addBothArrayList")




}