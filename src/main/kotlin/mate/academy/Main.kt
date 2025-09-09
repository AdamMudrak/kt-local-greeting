package mate.academy

fun greetUsers() {
    // implement function
    while (true) {
        println("Please enter a name (or press Enter to quit): ")
        val name = readln()
        if (name.isBlank()) return else println("Hello, $name")
    }
}

fun main() {
    greetUsers()
}
