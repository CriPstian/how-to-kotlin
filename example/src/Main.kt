open class Pet(val name: String)

class Dog(name: String = "Doggo", val age: Int):Pet(name) {
    private val nume: String = name

    infix fun playsWith(dog: Dog) {
        println("$nume plays with ${dog.name}")
    }

    operator fun component1() = nume
    operator fun component2() = age
}

fun testThis(str: String) = if(str.length > 2) "Test1" else "Test2"

fun main(args: Array<String>) {
    val dog = Dog("Capy", 3)
    val dog2 = Dog(age = 2, name = "Azorel")

    dog playsWith dog2

    val (_, age) = dog

    println("${dog.name} is $age years old")

    println(testThis("ABCSD"))

    val intRange = 1..4

}
