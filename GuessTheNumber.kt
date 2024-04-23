fun main(args: Array<String>){

    var numeroAleatorio = (1..100).random().toInt()

    var numero = 0

    var tentativas = 0

    println("Guess The Number!!")
    println("O programa irá gerar um número aleatório entre 1 e 100")
    println("Tente adivinhar qual é o número certo")

    do{
        println("Insira um número")
        numero = readLine()!!.toInt()

        if(numero > numeroAleatorio){
            println("O número $numero está maior que o número sorteado")
        }
        else if(numero < numeroAleatorio){
            println("O número $numero está menor que o número sorteado")
        }

        tentativas++
    }while (numero != numeroAleatorio)

    println("Parabéns, você acertou!!")

    println("Você tentou acertar $tentativas vezes")

}
