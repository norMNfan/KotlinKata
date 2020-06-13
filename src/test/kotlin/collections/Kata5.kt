package collections

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Kata5 {

    @Test
    fun `Fold the values in a list plus 10`() {
        val nums = listOf(1,2,3,4,5)

        assertEquals(25, nums)
    }

    @Test
    fun `Fold only even indexed values of a list plus 10`() {
        val nums = listOf(1,2,3,4,5)

        assertEquals(19, nums)
    }

    @Test
    fun `Reduce a list to the sum of all its elements`() {
        val nums = listOf(7,3,8,9,2,1,10)
            .reduce { acc, i -> acc + i }

        assertEquals(40, nums)
    }

    @Test
    fun `Reduce a list to the sum of its even elements`() {
        val nums = listOf(7,3,8,9,2,1,10)
            .reduceIndexed { index, acc, i -> if (index % 2  == 0) acc + i else acc }

        assertEquals(27, nums)
    }

    @Test
    fun `Group a list of numbers by their parity`() {
        val nums = listOf(7,3,8,9,2,1,10)
            .groupBy { it % 2 }

       assertEquals(mapOf(0 to listOf(8,2,10), 1 to listOf(7,3,9,1)), nums)
    }

    @Test
    fun `Group a list of numbers by parity, and reduce to their sum`() {
        val nums = listOf(7,3,8,9,2,1,10)
            .groupingBy { it % 2 }
            .reduce { key, accumulator, element -> accumulator + element }

        assertEquals(mapOf(0 to 20, 1 to 20), nums)
    }

    @Test
    fun `Chunk a list into a list of lists`() {
        val nums = listOf(1,2,3,4,5,6,7,8,9,10)

        assertEquals(listOf(
            listOf(1,2,3),
            listOf(4,5,6),
            listOf(7,8,9),
            listOf(10)
        ), nums)

    }
}