package exercises.day2.kotlin

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Overriding : ShouldSpec({

    /**
     * This test wants to create a string from list elements and replace values
     * should replace hardcoded values
     */
    should("Create a string from a list") {
        val list = ListOfString(listOf("one", "to", "sree"))
        val list2 = ListOfDifferentString(listOf("one", "to", "sree"))
        val listAsString = list.toString() shouldBe "one to sree"
        val listAsString2 = list2.toString() shouldBe "one tow three"
        println(listAsString)
        println(listAsString2)
    }
})

open class ListOfString(private val list: List<String>) {
    override fun toString(): String {
        TODO()
    }
}

class ListOfDifferentString(private val list: List<String>) : ListOfString(list) {
    override fun toString(): String {
        TODO()
    }
}