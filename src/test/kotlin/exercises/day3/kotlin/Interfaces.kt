package exercises.day3.kotlin

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

val check : isString = { it is String }

/**
 * Please create an typealias and then make test
 */
class Interfaces: ShouldSpec( {
    val result = check("Wanea") shouldBe true
    println(result)
    val result2 = check(53) shouldBe false
    println(result2)
})

typealias isString = (i:Any) -> Boolean
