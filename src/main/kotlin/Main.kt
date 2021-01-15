
fun main() {
    val amount = 100L
    var comission = amount * 0.0075
    if (comission < 35) comission = 35.0 else comission
    println("The commission for the operation: $comission cents")
}