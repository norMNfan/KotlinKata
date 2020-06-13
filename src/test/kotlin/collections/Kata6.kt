package collections

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Kata6 {
    // count, average, max, min, sum, comparator

    @Test
    fun `Find the number of element in a list`() {
        val nums = listOf(6,5,9,56,24,21,17,8,45,6,23,5,1)
        val count = TODO()

        assertEquals(13, count)
    }

    @Test
    fun `Find how many elements in a list are greater than 10`() {
        val nums = listOf(6,5,9,56,24,21,17,8,45,6,23,5,1)
        val count = TODO()

        assertEquals(6, count)
    }

    @Test
    fun `Find the average of number of a list of numbers`() {
        val nums = listOf(6,5,9,56,24,21,17,8,45,6,23,5,1)
        val average = TODO()

        assertEquals(17.384615384615383, average)
    }

    @Test
    fun `Find the max value of a list of numbers`() {
        val nums = listOf(6,5,9,56,24,21,17,8,45,6,23,5,1)
        val max = TODO()

        assertEquals(56, max)
    }

    @Test
    fun `Find the max value of a list of numbers after multiplying all odd numbers by 2`() {
        val nums = listOf(6,5,9,56,24,21,17,8,45,6,23,5,1)

        val max = TODO() //nums.maxBy { if (it % 2 == 1) it * 2 else it }

        assertEquals(45, max)
    }

    @Test
    fun `Find the min value of a list of numbers`() {
        val nums = listOf(6,5,9,56,24,21,17,8,45,6,23,5,1)
        val min = TODO()

        assertEquals(1, min)
    }

    @Test
    fun `Find the sum of a list of numbers`() {
        val nums = listOf(6,5,9,56,24,21,17,8,45,6,23,5,1)
        val sum = TODO()

        assertEquals(226, sum)
    }

    @Test
    fun `Find the sum of a list of numbers and multiply any number less than 10 by 2`() {
        val nums = listOf(6,5,9,56,24,21,17,8,45,6,23,5,1)
        val sum = nums.sumBy {
            if (it < 10) {
                it * 2
            } else {
                it
            }
        }

        assertEquals(266, sum)
    }
}