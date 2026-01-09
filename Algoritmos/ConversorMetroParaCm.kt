fun Double.toCentimeters() = this * 100

fun main(){
    print("Digite o valor em Metros: ")
    val numero = readLine()?.toDoubleOrNull()

    if(numero!=null){
        val cm = numero.toCentimeters()
        println("O valor em centímetros é $cm ")
    }else{
        println("Entrada Inválida")
    }

}