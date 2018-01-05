/**
 * - TODOs methods
 * - expression body
 */


object StuffClass {
    private val ceva by lazy {
        println("Just lazy")
        "Just that"
    }


    private var count = 0



    init {
        println("INitializing")
    }

    fun printStuff() = println("This is just printing")

    fun getCevaVar() = ceva
}

fun main(args: Array<String>) {
    println("Beginning")
    StuffClass.printStuff()

    val ceva = StuffClass.getCevaVar()

    println(ceva)

}