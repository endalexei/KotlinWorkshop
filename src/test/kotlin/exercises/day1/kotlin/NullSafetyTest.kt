package exercises.day1.kotlin

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class NullSafetyTest : ShouldSpec({

    /**
     * Create an inline function that will return either string length or null
     */
    should("Get String Length With Null Value") {
        val value1 = null
        val value2 = "a valid string"
        val result1 = getLength(value1)
        val result2 = getLength(value2)
        println("First result: $result1")
        result1 shouldBe null
        println("Second Result: $result2")
        result2 shouldBe 14
    }

    /**
     * Create functions in class to for validation to pass
     */
    should("Get Employ name and age") {
        val company = Company(Endava(Employee()))
        company.getEmployName() shouldBe "Sergiu"
        company.getEmployAge() shouldBe null
    }

    /**
     * Create a function that return string length or 0 if value null
     */
    should("Get length or 0") {
        val value1 = null
        val value2 = "Not null"
        val result1 = getLengthOrZero(value1)
        val result2 = getLengthOrZero(value2)
        println("First result: $result1")
        result1 shouldBe 0
        println("Second Result: $result2")
        result2 shouldBe 8
    }

    /**
     * Create a function that return string length or throw an exception if value null
     */
    should("Get length or exception") {
        val value1 = null
        val value2 = "Not null"
        val result2 = getLengthOrException(value2)
        shouldThrow<NullPointerException> {
            getLengthOrException(value1)
        }
        println("Second Result: $result2")
        result2 shouldBe 8
    }

    /**
     * Create a function that return safe cast to Employ
     */
    should("Get Employ with safeCast") {
        val value1 = Employee()
        val value2 = Employ2()
        val value3 = null
        val result1 = safeCastToEmploy(value1)
        val result2 = safeCastToEmploy(value2)
        val result3 = safeCastToEmploy(value3)
        println("First result: $result1")
        result1 shouldBe Employee()
        println("Second Result: $result2")
        result2 shouldBe null
        println("And Result: $result3")
        result3 shouldBe null
    }

    /**
     * Create a function that return list of Int without null values
     */
    should("Get List with no nulls") {
        val value = listOf(1, 2, null, 4, null)
        val result = removeNull(value)
        println("Result: $result")
        result shouldBe listOf(1, 2, 4)
    }
})

fun getLength(value: String?): Int? = value?.length
fun getLengthOrZero(value: String?): Int = value?.length ?: 0

fun getLengthOrException(value: String?): Int = value!!.length

fun safeCastToEmploy(value: Any?): Employee? = value as? Employee

fun removeNull(value: List<Int?>): List<Int> = value.filterNotNull()

data class Employ2(val name: String = "Sergiu", var age: String = "12")
data class Employee(val name: String = "Sergiu", var age: Int? = null)
data class Endava(val employee: Employee)
data class Company(val company: Endava?) {

    fun getEmployName(): String? = company?.employee?.name


    fun getEmployAge(): Int? {
        return  company?.employee?.age
    }
}