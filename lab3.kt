import kotlin.math.sqrt

fun main() {
    print("Введите число: ")
    val n = readlnOrNull()?.toIntOrNull()

    if (n != null) {
            val del= mutableSetOf(1, number) 
            val sqrtNumber = sqrt(number.toDouble()).toInt()
            for (i in 2..sqrtNumber) {
                if (n % i == 0) {
                    del.add(i)
                    del.add(n / i)
                }
            }
            println("Делители числа $n: ${del.sorted().joinToString(", ")}")
        } else {
        println("Некорректный ввод")
    }
}
