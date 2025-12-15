fun main(){

    for (i in 1..100){
        verificarMultiplos(i)
    }

}

fun verificarMultiplos(numero : Int){

    when{
        numero % 3 == 0 && numero % 5 == 0 -> println("FizzBuzz")
        numero % 3 == 0 -> println("Fizz")
        numero % 5 == 0 -> println("Buzz")
        else -> println(numero)
    }
}

