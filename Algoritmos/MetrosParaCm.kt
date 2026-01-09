fun main(){
  print("Digite o valor em metros: ")
  val numero = readLine()?.toDoubleOrNull()

  if (numero != null)  {
      print("O valor em centimetros é:")
      println(conversor(numero))
      } else {
      println("Entrada inválida. Digite um número válido.")
  }
}

fun conversor(numero: Double) : Double{
    return numero * 100

}