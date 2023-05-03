fun main() {
    val numbers = List(readln().toInt()) { readln().toInt()}
    println (if (numbers == numbers.sorted()) "YES" else "NO")
}