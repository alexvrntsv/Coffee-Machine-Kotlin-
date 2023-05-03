enum class Rainbow (val color: String, val number: Int) {
    RED("red", 1),
    ORANGE("orange", 2),
    YELLOW("yellow", 3),
    GREEN("green", 4),
    BLUE("blue", 5),
    INDIGO("indigo", 6),
    VIOLET("violet", 7);

    companion object {
        fun findColor(inputColor: String): Int {
            var number = 0
            for (line in Rainbow.values()) {
                if (line.color == inputColor) number = line.number
            }
            return number
        }
    }

}
fun main() {
    val color = readln()
    println(Rainbow.findColor(color))
}