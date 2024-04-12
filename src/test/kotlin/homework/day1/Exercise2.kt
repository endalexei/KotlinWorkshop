package homework.day1

import io.kotest.core.spec.style.FunSpec
import kotlin.test.assertEquals

class Exercise2 : FunSpec({

    test("Check nullable variable") {
        //replace TODO with a value to make the test pass
        val x: Int? = TODO()
        assertEquals(x, null)
    }

    test("Smart cast") {
        fun double(x: Int) = x * 2
        //replace TODO with a value to make the test pass
        fun nullDouble(x: Int?) = if (x == null) TODO() else double(x)

        assertEquals(10, nullDouble(5))
        assertEquals(0, nullDouble(null))
    }

    test("Elvis operator"){
        fun double(x: Int) = x * 2
        //replace TODO with a value to make the test pass
        fun nullDouble(x: Int?) = double(x ?: TODO())

        assertEquals(10, nullDouble(5))
        assertEquals(0, nullDouble(null))
    }

    test(""){
        //replace TODO with a value to make the test pass
        fun name(first: String, middle: String?, surname: String){
            TODO()
        }
        assert("James T. Kirk".equals(name("James", "Tiberius", "Kirk")))
        assert("John Doe".equals(name("John", null, "Doe")))
    }
})