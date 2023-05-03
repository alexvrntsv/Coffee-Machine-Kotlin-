package machine

enum class Recipe(val water: Int, val milk: Int, val beans: Int, val cups: Int, val money: Int, val id: String) {
    ESPRESSO(250, 0, 16,1, 4, "1"),
    LATTE(350, 75, 20, 1, 7, "2"),
    CAPPUCCINO(200, 100, 12, 1, 6, "3");
}
