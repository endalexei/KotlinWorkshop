package exercises.day3.kotlin

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Destructuring : ShouldSpec({

    var name = ""
    var age = 0

    fun destructuring(personValue: Person) {
        val (first, second) = personValue
        name = first
        age = second
    }

    /**
     * I would like you to use destructuring for this test
     * Please USE DESTRUCTURING I know there is other ways
     */
    should("Destructure Person objet") {
        val jan = Person("Jean-Claude Van Damme", 63)
        destructuring(jan)
        name shouldBe "Jean-Claude Van Damme"
        age shouldBe 63
    }

})

class Person(val personName: String, val age: Int) {
    operator fun component1(): String {
        return personName
    }

    operator fun component2(): Int {
        return age
    }

}