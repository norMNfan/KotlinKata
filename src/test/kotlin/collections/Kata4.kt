package collections

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Kata4 {
    // zip
    // unzip

    @Test
    fun `Reverse a list of numbers`() {
        val nums = listOf(1,5,6,8)

        assertEquals(listOf(8,6,5,1), nums)
    }

    @Test
    fun `Partition a list based on parity`() {
        val nums = listOf(1,6,8,4,7,10,2)
        val evenNums = TODO()
        val oddNums = TODO()

        assertEquals(listOf(6,8,10,2), evenNums)
        assertEquals(listOf(1,7), oddNums)
    }

    @Test
    fun `Take only the 1 to 3 indexes of a list`() {
        val nums = listOf(1,7,5,3,8,7,1)

        assertEquals(listOf(7,5,3), nums)
    }

    @Test
    fun `Sort a list of numbers`() {
        val nums = listOf(1,7,5,3,8,7,1)

        assertEquals(listOf(1,1,3,5,7,7,8), nums)
    }

    @Test
    fun `Sort a list of numbers in descending order`() {
        val nums = listOf(1,7,5,3,8,7,1)

        assertEquals(listOf(8,7,7,5,3,1,1), nums)
    }

    @Test
    fun `Sort a list of people by age in descending order`() {
        val people = listOf(
            Person("Shaqon", 24),
            Person("Asher", 12),
            Person("Geroge", 23),
            Person("Herodotus", 56),
            Person("Bart", 43)
        )

        assertEquals(listOf(
            Person("Herodotus", 56),
            Person("Bart", 43),
            Person("Shaqon", 24),
            Person("Geroge", 23),
            Person("Asher", 12)
        ), people)
    }

    @Test
    fun `Zip together two lists to make two pairs`(){
        val nums1 = listOf(2,4,6)
        val nums2 = listOf(1,3,5)
        val nums3 = TODO()

        assertEquals(listOf(Pair(2,1), Pair(4,3), Pair(6,5)), nums3)
    }

    @Test
    fun `Unzip two pairs to create two lists`() {
        val nums = listOf(Pair(1,2), Pair(3,4))

        assertEquals(Pair(listOf(1,3), listOf(2,4)), nums)
    }

}