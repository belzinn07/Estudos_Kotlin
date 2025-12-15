fun verificarMaioridade(idade: Int): String {
    return if (idade >= 18) {
        "Você é maior de idade."
    } else {
        "Você é menor de idade."
    }
}

fun main() {
    print("Digite sua idade: ")
    val idade = readLine()?.toIntOrNull()

    if (idade != null) {
        println(verificarMaioridade(idade))
    } else {
        println("Entrada inválida. Digite um número inteiro.")
    }
}