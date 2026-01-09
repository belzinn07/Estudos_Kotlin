fun calcularDesconto(preco:Double, percentual: Double) : Double{
  return  preco * percentual/100
}



fun main(){

println("---Sistema de Calculo de Desconto---")

println("Digite o preço do produto: ")
val precoProduto = readLine()?.toDoubleOrNull()

println("Digite o percentual de desconto: ")
val valorPercentual = readLine()?.toDoubleOrNull()

if (precoProduto != null && valorPercentual != null){
    val valorDeDesconto = calcularDesconto(precoProduto, valorPercentual)
    val precoFinal = precoProduto - valorDeDesconto
    println("O valor de Deconto é R$ $valorDeDesconto")
    println("O preço final é R$" +
            " $precoFinal")
} else{
    println("Entrada Inválida. Por favor, preencha os campos corretamente!")
}

}