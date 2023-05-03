fun main() {
    val longs = mutableListOf<Long>()
    val n = 100_000_000_000
    for (i in 1..3) {
        longs.add(n + i)
    }
    println(longs.joinToString())
}