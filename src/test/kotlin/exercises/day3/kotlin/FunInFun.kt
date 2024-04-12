package exercises.day3.kotlin

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class FunInFun : ShouldSpec({
    fun isBigger(a: Int, b: Int): Boolean {
        fun validate(a: Int, b: Int): Boolean {
            TODO()
        }
        TODO()
    }

    /**
     * Please, pretty please use function in function to make the compare
     * one is checking other is printing
     */
    should("Check if int is bigger then other big") {
        isBigger(2, 4) shouldBe false
        isBigger(8, 2) shouldBe true
    }
}
)