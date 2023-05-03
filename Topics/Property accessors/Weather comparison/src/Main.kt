class City(val name: String) {
    val defaultTemp = when (name) {
        "Moscow" -> 5
        "Hanoi" -> 20
        "Dubai" -> 39
        else -> 8008
    }
    var degrees: Int = 0
        set(value: Int) {
            field = if (value > -92 && value < 57) value
            else defaultTemp
        }
}        

fun main() {
    val first = readln().toInt()
    val second = readln().toInt()
    val third = readln().toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third
    print(
        when {
            firstCity.degrees < secondCity.degrees && firstCity.degrees < thirdCity.degrees -> firstCity.name
            secondCity.degrees < firstCity.degrees && secondCity.degrees < thirdCity.degrees -> secondCity.name
            thirdCity.degrees < firstCity.degrees && thirdCity.degrees < secondCity.degrees -> thirdCity.name
            else -> "neither"
        }
    )
}
