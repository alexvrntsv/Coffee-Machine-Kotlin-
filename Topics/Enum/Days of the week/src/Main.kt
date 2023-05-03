enum class DaysOfTheWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    fun printAllDays() {
        for (name in DaysOfTheWeek.values()) {
            println(name)
        }
    }
}

fun main() {
    val days = DaysOfTheWeek.SUNDAY
    days.printAllDays()
}