package collections

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class Kata7 {
    @Nested
    inner class Take {
        @Test
        fun `Take the first 5 elements of a list`() {
            val nums = listOf(6, 5, 9, 56, 24, 21, 17, 8, 45, 6, 23, 5, 1)
            val take = TODO()

            assertEquals(listOf(6, 5, 9, 56, 24), take)
        }

        @Test
        fun `Take elements from the list while each element is less then 10`() {
            val nums = listOf(6, 5, 9, 56, 24, 21, 17, 8, 45, 6, 23, 5, 1)
            val take = TODO()

            assertEquals(listOf(6, 5, 9), take)
        }

        @Test
        fun `Take the last 5 elements of a list`() {
            val nums = listOf(6, 5, 9, 56, 24, 21, 17, 8, 45, 6, 23, 5, 1)
            val take = TODO()

            assertEquals(listOf(1, 5, 23, 6, 45), take)
        }

        @Test
        fun `Take elements from the end of the list until an element is greater than 10`() {
            val nums = listOf(6, 5, 9, 56, 24, 21, 17, 8, 45, 6, 23, 5, 1)
            val take = TODO()

            assertEquals(listOf(1, 5), take)
        }
    }

    @Nested
    inner class Drop {
        @Test
        fun `Drop the first 5 elements of a list`() {
            val nums = listOf(6, 5, 9, 56, 24, 21, 17, 8, 45, 6, 23, 5, 1)
            val drop = TODO()

            assertEquals(listOf(21, 17, 8, 45, 6, 23, 5, 1), drop)
        }

        @Test
        fun `Drop elements in a list while they are less than 10`() {
            val nums = listOf(6, 5, 9, 56, 24, 21, 17, 8, 45, 6, 23, 5, 1)
            val drop = TODO()

            assertEquals(listOf(56, 24, 21, 17, 8, 45, 6, 23, 5, 1), drop)
        }

        @Test
        fun `Drop 5 elements from the end of the list`() {
            val nums = listOf(6, 5, 9, 56, 24, 21, 17, 8, 45, 6, 23, 5, 1)
            val drop = TODO()

            assertEquals(listOf(6, 5, 9, 56, 24, 21, 17, 8), drop)
        }

        @Test
        fun `Drop elements from the end of the list while they are less than 25`() {
            val nums = listOf(6, 5, 9, 56, 24, 21, 17, 8, 45, 6, 23, 5, 1)
            val drop = TODO()

            assertEquals(listOf(6, 5, 9, 56, 24, 21, 17, 8, 45), drop)
        }
    }

    @Nested
    inner class Element {
        @Test
        fun `Get the 3rd component of a list`() {
            val nums = listOf(6, 5, 9, 56, 24, 21, 17, 8, 45, 6, 23, 5, 1)
            val component = TODO()

            assertEquals(9, component)
        }

        @Test
        fun `Try to get the 15th element of the list and if it doesnt exist give the default value of 0`() {
            val nums = listOf(6, 5, 9, 56, 24, 21, 17, 8, 45, 6, 23, 5, 1)
            val element = TODO()

            assertEquals(0, element)
        }

        @Test
        fun `Get the 6th element of a list`() {
            val nums = listOf(6, 5, 9, 56, 24, 21, 17, 8, 45, 6, 23, 5, 1)
            val element = TODO()

            assertEquals(21, element)
        }
    }
}