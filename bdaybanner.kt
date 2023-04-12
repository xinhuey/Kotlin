fun main() {
    val border="%"
    val fancyBorder="-~.~-"
    val repeatTime=4
    printBorder()
    println("Happy Birthday, Jhansi!")
    printBorderP(fancyBorder,repeatTime)
}

//print border w no params
fun printBorder(){
    //println("=======================")
    repeat(23){
        print("=")
    }
    println()
}

//print border w selected params
fun printBorderP(border:String, repeatTime:Int){
    repeat(repeatTime){
        print(border)
    }
    println()
}