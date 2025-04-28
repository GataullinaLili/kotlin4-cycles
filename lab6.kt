fun main() {
    var sum = 0
    var a = 5
    while (a < 58) {
        if (a != 34 && a != 46 && a != 52) {
            sum += a
        }
        a++
    }
    println("Сумма чисел от 5 до 57, без 34, 46 и 52 = $sum")
}
