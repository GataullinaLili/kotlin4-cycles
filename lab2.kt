import kotlin.random.Random

fun main() {
    val a = Random.nextInt(1, 9)

    while (true) {
        println("Угадайте число от 1 до 9. Введите число ")
        val n = readlnOrNull()?.toIntOrNull()
        if (n == a) {
                println("Совпало число $a .")
                break
            } else {
                println("Не совпало, введите число еще раз.")
        } 
    }
}
