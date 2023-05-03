fun main() {
    val (b, a, c) = List(3) { readln().toInt()}
    println(b in a..c)
}