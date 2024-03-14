import java.util.Scanner

fun main() {
    var input=Scanner(System.`in`)
    var day= input.nextInt()
    var result=when(day){
        1->"Monday"
        1->"Tuesday"
        1->"Wednesday"
        1->"Thursday"
        else->"Invalid day of the week"

    }
    println("The day is $result")
}