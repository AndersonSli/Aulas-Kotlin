fun olaVoce(nome: String) = "Olá, $nome!"

fun main(){
    println("Olá, Mundo!")
    print("Qual seu nome? ")
    var nome = readLine().toString()
    print(olaVoce(nome))
}