package exercises.day2.kotlin

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Overloading : ShouldSpec({

    should("a list") {
        val point = Point(6, 8)
        val point2 = Point(3, 4)
        point + point2 shouldBe Point(9, 12)
        point - point2 shouldBe Point(3, 4)
        point * point2 shouldBe Point(18, 32)
        point / point2 shouldBe Point(2, 2)
        point.inc() shouldBe Point(7, 9)
        point.dec() shouldBe Point(5, 7)
    }

})

data class Point(val x: Int, val y: Int) {
    operator fun plus(p: Point) = Point(x + p.x, y + p.y)
    operator fun minus(p: Point) = Point(x - p.x, y - p.y)
    operator fun times(p: Point) = Point(x * p.x, y * p.y)
    operator fun div(p: Point) = Point(x / p.x, y / p.y)
    operator fun inc() = Point(x + 1, y + 1)
    operator fun dec() = Point(x - 1, y - 1)
}
