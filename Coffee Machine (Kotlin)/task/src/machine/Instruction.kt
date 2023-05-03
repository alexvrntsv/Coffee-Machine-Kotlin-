package machine

enum class Instruction(val id: String) {
    BUY("buy"),
    FILL("fill"),
    TAKE("take"),
    REMAINING("remaining"),
    EXIT("exit"),
    BACK("back");

    companion object {
        fun getById(id: String): Instruction? {
            return Instruction.values().firstOrNull { it.id == id }
        }
    }
}