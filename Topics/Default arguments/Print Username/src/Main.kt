fun greetings(name: String = ""): String {
    return if (name.isEmpty()) {
        "Hello, secret user!"
    } else {
        "Hello, $name!"
    }
}