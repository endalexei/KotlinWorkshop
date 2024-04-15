package exercises.day3.kotlin

import exercises.day3.java.Endava
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

/**
 * This exercise wants you to reuse Java class Endava
 * create and initialize an Edava object with 3-5 Endavians in a collection
 * Print each Endavian details in following format: 'Name: name, Age: age'
 * Don't forget to assert the result, this is a test, do not assert Unit
 * Because print return Unit, you will have to find another way to assert
 * object content, Yes we assert that object contains assigned values
 * ONE MORE THING, 1 'shouldBe' assertion should be used :)
 */
class UsingJava : ShouldSpec({
    should("Use java in Kotlin ") {
        val endavians = listOf(
            Endava("Valentina", 18), Endava("Valerian", 55),
            Endava("Sergiu", 12)
        )

        endavians.toString() shouldBe "[Endava{name='Valentina', age=18}, Endava{name='Valerian', age=55}, " +
                "Endava{name='Sergiu', age=12}]"
        endavians.forEach { println("Name: ${it.name}, Age: ${it.age}") }
    }

    /**
     * This exercise want to teach you cant trust java code in kotlin
     * Find the issue and fix it
     * Assert section should not change
     */
    should("Get workStatus") {
        val gicu = Endava("Gicu", 35)
        gicu.workStatus.substring(1) shouldBe null
    }
})