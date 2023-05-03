fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    if (a > b) println("-${ a - b }")
    else println(b - a)
}