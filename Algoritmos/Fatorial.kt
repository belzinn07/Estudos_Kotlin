fun main(){
    print("Digite um número: ")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {
        println(fatorial(numero))
    } else {
        println("Entrada inválida!")
    }


}

fun fatorial(numero : Int) : Long{
    require(numero>=0){"Digite um número maior ou igual a 0"}

    var resultado = 1L

    for (i in 1..numero){
       resultado *= i
    }

    return resultado
}