    fun main() {

        println("---Tabuada Dinâmica---")

        var numero: Int? = null

        while (numero == null) {
            println("Digite um número: ")
            val entrada = readLine()
            numero = entrada?.toIntOrNull()

            if (numero == null){
                println("Entrada Inválida. Digite um número inteiro")
            }
        }

        exibirMenuEResolver(numero)

        println("Programa finalizado. Até logo!")
    }

    fun exibirMenuEResolver(numero: Int){
        var opcao: Int? = -1
        while (opcao != 5) {
            println("\n--- MENU DE OPÇÕES ---")
            println("1. Adição")
            println("2. Subtra;ção")
            println("3. Multiplicação")
            println("4. Divisão")
            println("5. Sair")
            print("Escolha uma opção: ")

            opcao = readLine()?.toIntOrNull()

            when (opcao) {
                in 1..4 -> {
                    println("\nResultado:")
                    for (i in 1..10) {
                        when (opcao) {
                            1 -> println("$numero + $i = ${numero + i}")
                            2 -> println("$numero - $i = ${numero - i}")
                            3 -> println("$numero * $i = ${numero * i}")
                            4 -> println("$numero / $i = ${"%.2f".format(numero.toDouble() / i)}")
                        }
                    }
                }
                5 -> break
                else -> println("Opção inválida")
            }

        }
    }