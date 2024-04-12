package homework.day1

import io.kotest.core.spec.style.FunSpec
import kotlin.test.assertContains
import kotlin.test.assertEquals

class Exercise1 : FunSpec({

    test("Check if two numbers are equals") {
        var iCanChange = 5
        val iCannotChange = "42".toInt()

        //add something here to make it pass
        assertEquals(iCanChange, iCannotChange)
    }

    test("Check if two Strings are equals") {
        //change string to pass the test
        val mid = "123"
        val letters = "a $mid d".trimIndent()

        assertEquals(letters, "a b c d")
    }

    test("Check if two arrays are equals") {
        // fix the arguments to make test pass
        val odds: Array<Int> = arrayOf(1, 2, 3)
        val odds2 = (1..10 step 2).toList().toTypedArray()

        assertEquals(odds, odds2)
    }

    test("Check for elements in the list") {
        //find the error
        val chars = ('a'..'z').toList()
        val vowels = listOf('a', 'e', 'i', 'o', 'u')
        val consonants = chars - vowels

        assertContains(consonants, 'b', "The element is present in $consonants")
        // add assert that 'vowels' are not present in 'consonants'
    }

    test("List to String"){
        val names = listOf("John", "Horton", "Conway")

        // substitute TODO with the correct function
        val fullName: String = TODO()

        assertEquals(fullName, "John Horton Conway")
    }
})