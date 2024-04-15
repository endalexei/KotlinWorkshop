package exercises.day3.kotlin

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class ReturnsAndJumps : ShouldSpec( {
    fun List<Int>.findIndexOfFirstElementFromList(list: List<Int>): List<Int> {
        var response = mutableListOf<Int>()
        list.forEach loop@{
            response.add(this.indexOfFirst { number -> it == number  })
            for (i in 0..this.size) {
                if (this[i] == it) {
                    response.add(i)
                    return@loop
                }
            }
        }
        return response
    }

    /**
     * I want you to use a return structural jump
     * to use a for/forEach to find first index of searchList element in list
     */
    should("Return first element index from list"){
        val list = listOf(9,5,3,7,1,2,4,7)
        val searchList = listOf(4,7)
        val result =  list.findIndexOfFirstElementFromList(searchList) shouldBe listOf(6,3)
        println(result)
    }
})