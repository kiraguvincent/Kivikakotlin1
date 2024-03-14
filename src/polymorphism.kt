//Parent class
open class shape
{
    fun draw(){
        println("Drawing a shape")
    }
}

//Child class
class rhombus:shape(){}
fun draw(){
    println("Drawing a rhonmbus")
}

class parallelogram{
    fun draw(){
        println("Drawing a parallelogram" )
    }
}

fun main() {
    var s=shape()
    s.draw()

    var r=rhombus()
    s.draw()

    var p=parallelogram()
    p.draw()

}