import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class NullSafetyTest : ShouldSpec({

    /**
     * Create an inline function that will return either string length or null
     */
    should("Get String Length WIth Null Value") {
        val value1 = null
        val value2 = "a valid string"
        println(getLength(value1))
        getLength(value1) shouldBe null
        println(getLength(value2))
        getLength(value2) shouldBe 14
    }

    /**
     * Create functions in class to for validation to pass
     */
    should("Get Employ name and age") {
        val company = Company(Endava(Employ()))
        company.getEmployName() shouldBe "Sergiu"
        company.getEmployAge() shouldBe null
    }
})

fun getLength(value: String?): Int? = value?.length

data class Employ(val name: String = "Sergiu", var age: Int? = null)
data class Endava(val employ: Employ?)
data class Company(val company: Endava) {

    fun getEmployName(): String? {
        val company = Company(Endava(Employ()))
        val name = company.company.employ?.name
        println("Employ name is $name")
        return name
    }

    fun getEmployAge(): Int? {
        val company = Company(Endava(Employ()))
        val age = company.company.employ?.age
        println("Employ age is $age")
        return age
    }
}