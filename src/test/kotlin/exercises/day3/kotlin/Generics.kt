package exercises.day3.kotlin

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Generics : ShouldSpec({

    /**
     * I want you to suffer and create a class that get generic type of data
     * and a function that sum created object elements
     */
    should("if int sum if string text")
    {
        val integer = SumVals(1, 3).sum() shouldBe 4
        val string = SumVals("This", "That").sum() shouldBe "This and That"
        println(integer)
        println(string)
    }

})

class SumVals<T>(val a: T, val b: T) {
    fun sum(): Any {
        return when (a) {
            is Int -> a + (b as Int)
            is String -> "$a and $b"
            else -> Unit
        }
    }

    fun sum3(): Any {
        return when {
            a is Int && b is Int -> a + b
            a is String && b is String -> "$a and $b"
            else -> Unit
        }
    }

    fun sum2(): Any {
        return if (a is Int && b is Int) {
            a + b
        } else if (a is String && b is String) {
            "$a and $b"
        } else Unit
    }
}