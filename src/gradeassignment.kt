import java.util.*

fun main() {
    var input = Scanner(System.`in`)
    println("Enter  marks : ")
     var marks = input.nextInt()
    var result=when(marks){
        in 80..100->"A"
        in 70..79->"B+"
        in 50..69->"B"
        in 30..49->"B-"
        in 20..29->"C+"
        else  -> "Invalid Mark"

    }
    println("The grade is $result")

}