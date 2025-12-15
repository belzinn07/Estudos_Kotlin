
fun main() {
    print("Digite uma palavra: ")
    val palavra = readLine().toString()

    val invertida = verificarPalindromo(palavra)

    if (verificarPalindromo(palavra)){
        print("$palavra é palindromo")
    } else{
        print("$palavra não é palindromo")
    }
}



fun verificarPalindromo(str: String): Boolean {

    val strNormal = str.lowercase()

    val strInvertida = str.reversed()

    return strNormal == strInvertida

}

