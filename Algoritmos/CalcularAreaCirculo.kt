const val VALOR_DE_PI = 3.14
fun Double.toQuadrado ()= this * this

fun Double.toArea() = this.toQuadrado() * VALOR_DE_PI

fun main(){
    print("Digite o raio do circulo: ")
    val input = readLine()?.toDoubleOrNull()

    if (input != null){
        val area = input.toArea()
        println("Como o raio do circulo é $input, a sua área é $area")
    } else{
     println("Entrada Inválida")
    }

}