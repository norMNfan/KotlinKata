package collections

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class Kata2 {

    @Nested
    inner class Operators {
        @Test
        fun `Add two lists together`() {
            val nums1 = listOf(1, 2, 3)
            val nums2 = listOf(4, 5, 6)
            val nums3 = nums1 + nums2

            assertEquals(listOf(1, 2, 3, 4, 5, 6), nums3)
        }

        @Test
        fun `Remove an item from a list`() {
            val nums = listOf(1, 2, 3) - 3

            assertEquals(listOf(1, 2), nums)
        }

        @Test
        fun `Add another entry to a map`() {
            val map = mapOf(1 to "One", 2 to "Two") + Pair(3, "Three")

            assertEquals(mapOf(1 to "One", 2 to "Two", 3 to "Three"), map)
        }

        @Test
        fun `Add an element to a mutable list`() {
            val nums = mutableListOf(1, 2, 3)
            nums += 4

            assertEquals(mutableListOf(1, 2, 3, 4), nums)
        }
    }

    @Nested
    inner class Filtering {
        @Test
        fun `Filter numbers less than 5`() {
            val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter { it < 5 }

            assertEquals(listOf(1, 2, 3, 4), nums)
        }

        @Test
        fun `Filter even numbers only`() {
            val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter { it % 2 == 0 }

            assertEquals(listOf(2, 4, 6, 8, 10), nums)
        }

        @Test
        fun `Filter names with a length greater than 4`() {
            val names = listOf("Steve", "Elon", "Larry", "Jeff", "Mark", "Tim", "Sundar")
                .filter { it.length > 4 }

            assertEquals(listOf("Steve", "Larry", "Sundar"), names)
        }

        @Test
        fun `Filter a map before the year 1960`() {
            val names = mapOf(
                1971 to "Elon Musk",
                1955 to "Steve Jobs",
                1944 to "Larry Ellison"
            ).filterKeys { it < 1960 }

            assertEquals(
                mapOf(
                    1955 to "Steve Jobs",
                    1944 to "Larry Ellison"
                ), names
            )
        }

        @Test
        fun `Filter Steve Jobs out of a map`() {
            val names = mapOf(
                1971 to "Elon Musk",
                1955 to "Steve Jobs",
                1944 to "Larry Ellison"
            ).filterValues { it != "Steve Jobs" }

            assertEquals(
                mapOf(
                    1971 to "Elon Musk",
                    1944 to "Larry Ellison"
                ), names
            )
        }

        @Test
        fun `Filter out indexes 2 and 3`() {
            val nums = listOf(1, 2, 3, 4, 5)
                .filterIndexed { index, i ->
                    index != 2 && index != 3
                }

            assertEquals(listOf(1, 2, 5), nums)
        }
    }
}