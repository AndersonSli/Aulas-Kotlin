fun soma(num1: Int, num2: Int) = num1 + num2

fun main(){
    print("num1: ")
    var num1 = readLine().toString().toInt()
    print("num2: ")
    var num2 = readLine().toString().toInt()
    print(soma(num1, num2))
}