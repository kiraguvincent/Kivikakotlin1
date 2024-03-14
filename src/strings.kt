fun main() {
    var greetings="Hello world"
    var firstname="Glory"
    var lastname="eMobilis"


    //String concatenation
    println(firstname+" "+lastname)
    println(firstname.plus(lastname))

    //Accessing an element in a string
    println(greetings[6])

    //Determining the index position of an element
    println(greetings.indexOf("world"))
    println(greetings.indexOf('H'))

    //Modifying a string
    println(greetings.uppercase())
    println(greetings.lowercase())


    //String interpolation
    println("Hello there, my name is $firstname $lastname")

    //Size of a string
    println(greetings.length)

}