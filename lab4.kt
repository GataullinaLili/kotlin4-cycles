fun main() {
    println("Введите число: ")
    val n = readlnOrNull()
    if (n != null) {
        var a = 0
        var b = 0
        for (char in n) {
                val digit = char.toString().toInt()
                if (digit % 2 == 0) {
                    a++
                } else {
                    b++
                }
        }
        println("Количество четных цифр: $a")
        println("Количество нечетных цифр: $b")
    } else {
        println("Некорректный ввод")
    }
}
