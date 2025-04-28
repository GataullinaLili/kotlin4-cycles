fun main() {
    (1..5).forEach { i ->
        println((1..i).joinToString("") { i.toString() })
    }
}
