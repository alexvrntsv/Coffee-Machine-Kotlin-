class Kitty {
    var color: String = "color"
    var age: Int = 0

    constructor()

    constructor(color: String, age: Int) {
        this.color = color
        this.age = age
    }

    constructor(age: Int, color: String) {
        this.color = color
        this.age = age
    }

    constructor(color: String) {
        this.color = color
    }

    constructor(age: Int) {
        this.age = age
    }
}
