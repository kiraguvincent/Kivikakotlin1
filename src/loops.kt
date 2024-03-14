fun main() {
    //While loop
    var number=200
    while (number<=205){
        println("Number is $number")
        number++
    }


    //Decreament
    var k=100
    while (k>=95){
        println("Number is $k")
        k--
    }



        //Do....while loop
       var numb=20
      do {
      println(numb)
    numb++

      }  while (numb<=25)


      //For loop
      var furniture= arrayOf("Table","Chair","Desk")
      for (z in furniture){
          println(z)
      }



    var marks= arrayOf(90,80,98,100,72)
    for (h in marks){
        println("Marks  is $h")
    }

    //Range
    for (number in 30..35){
        println(number)
    }


    for (letters in 'a' .. 'z'){
        println(letters)
    }
}
