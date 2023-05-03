
fun f(x: Double): Double {
    val result = when {
        x <= 0 -> f1(x)
        x > 0 && x < 1 -> f2(x)
        x >= 1 -> f3(x)
        else -> 0.0
    }
    return result
}

fun f1(x: Double): Double {
    return x * x + 1
}

fun f2(x: Double): Double {
    return 1 / (x * x)
}

fun f3(x: Double): Double {
    return x * x - 1
}