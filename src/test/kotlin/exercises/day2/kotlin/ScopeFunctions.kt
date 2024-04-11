package exercises.day2.kotlin

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.comparables.shouldBeGreaterThanOrEqualTo
import io.kotest.matchers.shouldBe
import kotlin.random.Random

class ScopeFunctions : ShouldSpec({

    fun getNameAndAGeAsString(peron: Person): String {
        peron.let { return "${it.Name} is ${it.age} years old" }
    }

    /**
     * This exercise wants you to use let function to return a pretty string
     */
    should("Pretty print class Person") {
        val person = Person("Valerian", 22)
        val result = getNameAndAGeAsString(person) shouldBe "Valerian is 22 years old"
        println(result)
    }

    fun countInString(number: String):Int {
        number.run {
            return count{it == 'a'}
        }
    }

    /**
     * This example want you to use run function
     * in kotlin count requires an expression of compare that should return boolean true
     */
    should("Count 'a' in string"){
        val result = countInString("I hate my life so hard") shouldBe 2
        println(result)
    }

    fun getPersonAge(person:Person): Int{
        person.apply { return age }
    }

    /**
     * here we will use apply to se how it works
     */
    should("Get person age"){
        val person = Person("Fan Fan Lilliputian", 99)
        val result = getPersonAge(person) shouldBe 99
        println(result)
    }

    fun getRandomDouble(max: Int): Int {
        Random.nextInt(max).also {
            return it + max
        }
    }

    /**
     * This exercise requires to create a random number and make that number greater then given max
     * please use also function
     * import kotlin.random.Random  -> random generation library
     * nextInt right operator for generating random int
     */
    should("Create a random number greater than max") {
        val max = 13
        val result = getRandomDouble(max) shouldBeGreaterThanOrEqualTo max
        println(result)
    }

})

class Person(val Name: String, var age: Int)