fun main() {
    //Predefined functions
    println("Hello Kotlin")

    var x =Math.min(45,89)
    println(x)

    
    var y =Math.max(90,124)
    println("The maximum number is $y")


    var z =Math.round(45.98)
    println(z)
//Calling functions
    name()
    product(12 ,30)
    product(120 ,310)
    details(  "Hosea", 12)
    details(  "joy", 32)

}
//User-defined function
fun name(){
    println("Vincent")
}



fun product(num1:Int,num2:Int){
    println(num1*num2)
}

fun details(name:String,age:Int){
    println("$name is $age years old")
}