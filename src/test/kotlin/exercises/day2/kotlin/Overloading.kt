package exercises.day2.kotlin

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Overloading : ShouldSpec({

    should("a list") {
        val point = Point(6, 8)
        val point2 = Point(3, 4)
        point.plus(point2) shouldBe Point(9, 12)
        point.minus(point2) shouldBe Point(3, 4)
        point.times(point2) shouldBe Point(18, 32)
        point.div(point2) shouldBe Point(2, 2)
//        point.inc() shouldBe Point(7, 9)
//        point.dec() shouldBe Point(5, 7)
    }

})

class Point(val x: Int, val y: Int)  {
    operator fun plus(p: Point){
        TODO()
    }
    operator fun minus(p: Point) {
        TODO()
    }
    operator fun times(p: Point) {
        TODO()
    }
    operator fun div(p: Point) {
        TODO()
    }
//    operator fun inc(){
//        TODO()
//    }
//    operator fun dec(){
//        TODO()
//    }
}
