class person{
    //Attributes/Properties
    var name ="John"
    var age =67
    var gender ="Male"

    //Methods/Functions
    fun walk(){
        println("Person is walking")
    }
}

fun main() {
    var accountant=person()
    //Calling a function
    accountant.walk()
    println(accountant.gender)
    println(accountant.age)
    println(accountant.name)
}