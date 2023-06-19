fun main(){
ageClassifier(11)
    ageClassifier(15)
    ageClassifier(23)

    numAge(45)
    numAge(34)
    numAge(23)

numbs(arrayOf(34,67,89,67,34))

 number(34)
    number(56)
    number(39)

    Country("Rwanda")
    Country("Ghana")
    Country("Portugal")
    Country("Wales")
    Country("Kenya")
    Country("Tanzania")


    var languages= arrayOf("zulu","kiswahili","kenyarwanda","kiganda")
    for (lang in languages){
        println("I can speak $lang")
    }

    for(x in 64..74){
        println(x*x)
    }

    val name="Adalab"
    for(Char in name)
        println(Char)

    println(ArrayMixedType(arrayOf(23.4,34.60,"grace",56,34.89,"tree",23)))

}


fun ageClassifier(age:Int) {
    if (age in 13..19) {
        println("you are a teenager")
    } else {
        println("you are not a teenager")
    }
}

fun numAge(age: Int){
    if(age in 0..1){
        println("you are a baby")
    }
    else if(age in 2..3){
        println("you are a toddler")
    }
    else if(age in 4..17){
        println("you are a child")
    }
    else{
        println("you are an adult")
    }
    when(age){
        in 0..1-> println("you are a baby")
        in 2..3-> println("you are a toddler")
        in 4..17->println("you are a child")
        else-> println("you are an adult")
    }
}

fun number(num:Int){
    if(num%2==0){
        println("$num is a prime number")
    }
    else{
        println("$num is not a prime number" )
    }
}

fun Country(name:String){
  when(name) {
      in "Rwanda"-> println("rwandese")
      in "Ghana"->println("ghanaian")
      in "Portugal"-> println("portugese")
      in "Wales"-> println("walish")
      else-> println("not applicable")

  }
}
fun numbs(nums:Array<Int>){
    for(num in nums) {
        if (num % 2 == 0) {
            println("$num is even")
        } else {
            println("$num is odd")
        }

    }
}
//write a function that takes in an array of mixed types and returns the sum of the decimal elements
fun ArrayMixedType(mixedType:Array<Any>):Double{
    var sum=0.00
    for(r in mixedType){
        if(r is Double){
          sum+=r
        }else if(r is Float){
            sum+=r.toDouble()
        }

    }
   return sum
}
