fun main() {
    val list = List<Char>(4) { readln().single() }
    for (char in list)   {
        println(char.isDigit())
    }
}