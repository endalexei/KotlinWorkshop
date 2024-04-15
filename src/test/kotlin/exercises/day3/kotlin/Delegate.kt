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
        val result1 = NewFeature(b).mymessage() shouldBe "MoverLover"
        val result2 = NewFeature(b).mymessageline() shouldBe "Welcome, Noob!"
        println(result1)
        println(result2)
    }
})

interface delegation {
    fun mymessage(): String
    fun mymessageline(): String
}

class Delegationimplementation(val y: String) : delegation {
    override fun mymessage(): String {
        return y
    }

    override fun mymessageline(): String {
        return y
    }
}

class NewFeature(m: delegation) : delegation by m {
    override fun mymessage(): String {
        return "MoverLover"
    }
}
