package collections

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Kata1 {
    @Test
    fun `Create an empty list of Strings`() {
        val emptyListOfString = emptyList<String>()

        assertEquals(emptyListOfStringSolution, emptyListOfString)
    }

    @Test
    fun `Create an empty set of Strings`() {
        val emptySetOfString = emptySet<String>()

        assertEquals(emptySetOfStringSolution, emptySetOfString)
    }

    @Test
    fun `Create a map with the key-value pairs`() {
        val nameMap: Map<String, String> = mapOf("Steve" to "Jobs", "Larry" to "Ellison")

        assertEquals(nameMapSolution, nameMap)
    }

    @Test
    fun `Create a mutable list of Int`() {
        val mutableList = mutableListOf<Int>()

        assertEquals(mutableListSolution, mutableList)
    }

    @Test
    fun `Create a mutable set of String`() {
        val mutableSet = mutableSetOf<Int>()

        assertEquals(mutableSetSolution, mutableSet)
    }
}