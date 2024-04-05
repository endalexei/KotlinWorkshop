package exercises.kotlin

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Lambda : ShouldSpec({

    val sum = Unit

    val increase = Unit

    /**
     * This exercise requires to create a sum lambda expression
     */
//    should("Sum 2 numbers using lambda variables") {
//        val result = sum(4, 5) shouldBe 9
//        println(result)
//    }

    /**
     * This exercise requires to create a val with function literals with receiver
     */
//    should("Increase number with 6") {
//        val result = 5.increase(6) shouldBe 11
//        println(result)
//    }

    /**
     * This test requires to use Passing trailing lambdas
     */
    should("Sum all elements in list") {
        val numbers = listOf(1, 2, 3, 4)
        val result = sumListElements(numbers) shouldBe 10
        println(result)
    }

    /**
     * This test requires to use it: implicit name of a single parameter in a function with .filter
     * followed by a lambda expression
     * Note that according to Kotlin convention, if the last parameter of a function is a function,
     * then a lambda expression passed as the corresponding argument can be placed outside the parentheses.
     * Also, don't forget that if you have one parameter you don't need to declare it and -> can be
     * omitted, and use it parameter name
     */
    should("Return numbers > 0") {
        val numbers = listOf(-1, 0, 3, -4)
        val result = filterPositiveNumbers(numbers) shouldBe intArrayOf(3)
        println(result)
    }

    /**
     * This exercise want to make usage of underscore for unused variables in lambda
     */
    should("Get values from map") {
        val map = mapOf(1 to "This ", 2 to "was ", 3 to "printed ", 4 to "from ", 5 to "map")
        getValueFromMap(map) shouldBe "This was printed from map"
    }

})

fun sumListElements(list: List<Int>): Int = TODO()

fun filterPositiveNumbers(list: List<Int>): List<Int> = TODO()

fun getValueFromMap(map: Map<Int, String>): String {
    TODO()
}