fun main() {
    var sum = 0
    for (i in 0..100 step 4) {
        sum += i
    }
    println("Сумма чисел от 1 до 100, которые кратны 4: $sum")
}
