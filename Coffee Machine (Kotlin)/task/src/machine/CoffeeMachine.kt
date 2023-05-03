package machine

import kotlin.system.exitProcess

class CoffeeMachine(
    private var waterInMachine: Int = 400,
    private var milkInMachine: Int = 540,
    private var beansInMachine: Int = 120,
    private var cupsInMachine: Int = 9,
    private var moneyInMachine: Int = 550
) {

    private fun userInput(massage: String): String {
        println(massage)
        return readln().lowercase()
    }

    fun menu() {
        when (Instruction.getById(userInput("Write action (buy, fill, take, remaining, exit): "))) {
            Instruction.BUY -> buy()
            Instruction.FILL -> fill()
            Instruction.TAKE -> take()
            Instruction.REMAINING -> containedInMachine()
            Instruction.EXIT -> exitProcess(0)
            else -> println("Wrong input!")
        }
        menu()
    }

    private fun buy() {
        val coffee = when (userInput("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")) {
            Recipe.ESPRESSO.id -> Recipe.ESPRESSO
            Recipe.LATTE.id -> Recipe.LATTE
            Recipe.CAPPUCCINO.id -> Recipe.CAPPUCCINO
            Instruction.BACK.id -> return menu()
            else -> return buy()
        }
        if (enoughIngredients(coffee)) {
            println("I have enough resources, making you a coffee!")
            makeCoffee(coffee)
        } else println("Sorry, not enough ${notEnoughIngredients(coffee)}!")
    }

    private fun enoughIngredients(recipe: Recipe): Boolean {
        return (waterInMachine - recipe.water >= 0 &&
                milkInMachine - recipe.milk >= 0 &&
                beansInMachine - recipe.beans >= 0 &&
                cupsInMachine - recipe.cups >= 0)
    }

    private fun makeCoffee(recipe: Recipe) {
        waterInMachine -= recipe.water
        milkInMachine -= recipe.milk
        beansInMachine -= recipe.beans
        cupsInMachine -= recipe.cups
        moneyInMachine += recipe.money
    }

    private fun notEnoughIngredients(recipe: Recipe): String {
        return when {
            waterInMachine - recipe.water < 0 -> "water"
            milkInMachine - recipe.milk < 0 -> "milk"
            beansInMachine - recipe.beans < 0 -> "bean"
            cupsInMachine - recipe.cups < 0 -> "cups"
            else -> "Something wrong"
        }
    }

    private fun fill() {
        waterInMachine += userInput("Write how many ml of water you want to add: ").toInt()
        milkInMachine += userInput("Write how many ml of milk you want to add: ").toInt()
        beansInMachine += userInput("Write how many grams of coffee beans you want to add: ").toInt()
        cupsInMachine += userInput("Write how many disposable cups you want to add: ").toInt()
    }

    private fun take() {
        println("I gave you \$$moneyInMachine")
        moneyInMachine = 0
    }

    private fun containedInMachine() {
        println(
            "The coffee machine has:\n" +
                    "$waterInMachine ml of water\n" +
                    "$milkInMachine ml of milk\n" +
                    "$beansInMachine g of coffee beans\n" +
                    "$cupsInMachine disposable cups\n" +
                    "\$$moneyInMachine of money"
        )
    }
}