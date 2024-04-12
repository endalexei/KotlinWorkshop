package exercises.day3.kotlin

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

/**
 * Delegation is something all leads should do
 * if you dont delegate you are not a leader
 */
class Delegate : ShouldSpec({
    should("Delegate is the key to success ") {
        val b = Delegationimplementation("Welcome, Noob!")
//        val result1 = Newfeature(b).mymessage() shouldBe "MoverLover"
//        val result2 = Newfeature(b).mymessageline() shouldBe "Welcome, Noob!"
//        println(result1)
//        println(result2)
    }
})

interface delegation {
    //TODO implement
}

class Delegationimplementation(val y: String) : delegation {
    //TODO implement
}

class Newfeature(m: delegation) : delegation by m {
    //TODO override
}
