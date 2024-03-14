import java.util.Scanner

fun main() {
    var reader=Scanner(System.`in`)
    println("Enter room temparature:")
    var temparature=reader.nextInt()
    if (temparature <25){
        println("It is cold")

    }
    else {
        println("It is hot")
    }
}