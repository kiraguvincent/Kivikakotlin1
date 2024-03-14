//Paerent class/Super class/Base class
open class Animal{
    var age=2
    var gender="female"
    fun move(movement:String){
        println("Animal is $movement")
    }
}
//Child class
open class Duck:Animal(){
    var color="white"
    fun sound(){
        println("Duck is quacking")
    }

}

class fish:Duck(){
    var hasscales=true
    var hasfins=true

    fun eat (){
        println("Fish is eating")
    }
}

fun main() {
    var a =Animal()
    var d =Duck()
    println(d.gender)

    var nileperch =fish()
}