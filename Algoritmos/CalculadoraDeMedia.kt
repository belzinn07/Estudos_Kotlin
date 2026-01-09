fun calcularMedia(num1: Double, num2: Double, num3: Double, num4: Double): Double {
    return (num1 + num2 + num3 + num4) / 4
}


fun main() {

    println("Calculadora de Média")

    println("Digite a nota 1:")
    val primeiraNota = readLine()?.toDoubleOrNull() ?: 0.0
    
    println("Digite a nota 2:")
    val segundaNota = readLine()?.toDoubleOrNull() ?: 0.0
    
    println("Digite a nota 3:")
    val terceiraNota = readLine()?.toDoubleOrNull() ?: 0.0
    
    println("Digite a nota 4:")
    val quartaNota = readLine()?.toDoubleOrNull() ?: 0.0

    val media = calcularMedia(primeiraNota, segundaNota, terceiraNota, quartaNota)
    println("A sua Média Aritmétrica é $media")
    when(media){
        in 0.0..5.99 -> println("Você está Reprovado")
        in 0.0..6.99 -> println("Você está em Recuperação")
        in 7.0..10.0 -> println("Você está Aprovado")
        else -> println("Valor fora do esperado")
    }

}

