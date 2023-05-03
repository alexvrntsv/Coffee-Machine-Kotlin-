fun checkSpeed(speed: Int, limit: Int = 60) {
    println(
        when {
            speed <= limit -> "Within the limit"
            else -> "Exceeds the limit by ${speed - limit} kilometers per hour"
        }
    )
}
