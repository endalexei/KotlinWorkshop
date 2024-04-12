package homework.day1

import io.kotest.core.spec.style.FunSpec

// Write a Kotlin generic function that swaps the values of two variables in array
class Exercise8 : FunSpec({

    fun <T> swap(array: Array<T>) {
        // Enter your code here
    }

    test("Swap the values of two variables in array"){
        val numbers = arrayOf(37, 153)
        val strings = arrayOf("ChatGPT", "Spotify")

        // Call swap() function for each array and print results
    }
})