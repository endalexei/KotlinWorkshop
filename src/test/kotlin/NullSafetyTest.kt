import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NullSafetyTest {

    private fun getLength(value: String?): Int? = value?.length


    @Test
    fun getStringLengthWIthNullValue() {
        val value1 = null
        val value2 = "a valid string"
        println(getLength(value1))
        assertEquals(getLength(value1), null)
        println(getLength(value2))
        assertEquals(getLength(value2), 14)

    }


    @Test
    fun getEmployAge() {
        val company = Company(Endava(Employ()))
        println("Employ name is ${company.company.employ?.name}")
        println("Employ age is ${company.company.employ?.age}")
    }
}

data class Employ(val name: String = "Sergiu", var age: Int? = null)
data class Endava(val employ: Employ?)
data class Company(val company: Endava)