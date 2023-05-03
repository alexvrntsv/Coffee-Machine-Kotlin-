fun main() {
    val n = readln().toInt()
    val firstDigit = n / 100
    val secondDigit = (n - firstDigit * 100) / 10
    val lastDigit = n % 10
    println(firstDigit + secondDigit + lastDigit)
}