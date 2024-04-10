package exercises.day2.kotlin

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Collections : ShouldSpec({

    fun List<String>.printByList() {
        TODO()
    }

    /**
     * This exercise wants you to create a collection and call the function
     * don't forget to asser the result, this is a test after all
     * Things to print :
     * Number of elements:
     * Third element:
     * Fourth element:
     * Index of element "two"
     */
    should("Use a collection to print text") {
        val numbers = listOf("one", "two", "three", "four")
        numbers.printByList() shouldBe Unit
    }

    fun List<String>.getShortWordsTo(shortWords: MutableList<String>, maxLength: Int) {
        TODO()
    }

    /**
     * This exercise wants to use filterTo
     * article to be removed = "a", "A", "an", "An", "the", "The"
     */
    should("Remove words with length > 3 and remove articles from phrase") {
        val words = "A long time ago in a galaxy far far away".split(" ")
        val shortWords = mutableListOf<String>()
        words.getShortWordsTo(shortWords, 3)
        shortWords shouldBe listOf("ago", "in", "far", "far")
        println(shortWords)
    }

    fun increaseList(list: List<Int>): MutableList<Int> {
        TODO()
    }

    /**
     * This Exercise wants you to use collections prepared functions and list iterator
     */
    should("Make list 1..6 from existing") {
        val numbers = listOf(2, 5, 5)
        val result = increaseList(numbers) shouldBe mutableListOf(1, 2, 3, 4, 5, 6)
        println(result)
    }

    fun makeIntList(number: Int): List<Int> {
        TODO()
    }

    /**
     * This exercise want's you to create a list of Int
     */
    should("Return a list") {
        val response = makeIntList(10) shouldBe listOf(0, 3, 6, 9)
        println(response)
    }

    infix fun List<Int>.combineWith(list: List<Int>): Set<Int>{
        TODO()
    }
    fun List<Int>.uniteWith(list: List<Int>): Set<Int> {
        TODO()
    }

    /**
     * This Test wants you to return commune and all elements of 2 lists with unique values
     */
    should("Combine Lists and return unique values") {
        val list1 = listOf(1, 1, 2, 3, 5, 8, -1)
        val list2 = listOf(1, 1, 2, 2, 3, 5)

        val result1 = list1 combineWith list2  shouldBe setOf(1, 2, 3, 5)
        println(result1)
        val result2 = list1.uniteWith(list2) shouldBe setOf(1, 2, 3, 5, 8, -1)
        println(result2)
    }

})

