
fun carPrice(old: Int = 5, kilometers: Int = 100000, maximumSpeed: Int = 120, automatic: Boolean = false) {
    var prise = 20000
    val year = old * 2000
    val speed = if (maximumSpeed < 120) (120 - maximumSpeed) * 100 else -(maximumSpeed - 120) * 100
    val odometer = kilometers / 10000 * 200
    val notFunTransmissionTax = if (automatic) -1500 else 0
    prise -= year + speed + odometer + notFunTransmissionTax
    println(prise)
}
