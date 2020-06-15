package collections

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class Kata2 {

    @Nested
    inner class Operators {
        @Test
        fun `Add two lists together`() {
            val nums1 = listOf(1,2,3)
            val nums2 = listOf(4,5,6)
            val nums3 = TODO("In kotlin, lists are read-only, which means adding two lists together creates a new list")

            assertEquals(listOf(1,2,3,4,5,6), nums3)
        }

        @Test
        fun `Remove an item from a list`() {
            val nums = listOf(1,2,3)

            assertEquals(listOf(1,2), nums)
        }

        @Test
        fun `Add another entry to a map`() {
            val map = mapOf(1 to "One", 2 to "Two")

            assertEquals(mapOf(1 to "One", 2 to "Two", 3 to "Three"), map)
        }

        @Test
        fun `Add an element to a mutable list`() {
            val nums = mutableListOf(1,2,3)

            assertEquals(mutableListOf(1,2,3,4), nums)
        }
    }

    @Nested
    inner class Filtering {
        @Test
        fun `Filter numbers less than 5`() {
            val nums = listOf(1,2,3,4,5,6,7,8,9,10)

            assertEquals(listOf(1,2,3,4), nums)
        }

        @Test
        fun `Filter even numbers only`() {
            val nums = listOf(1,2,3,4,5,6,7,8,9,10)

            assertEquals(listOf(2,4,6,8,10), nums)
        }

        @Test
        fun `Filter names with a length greater than 4`() {
            val names = listOf("Steve", "Elon", "Larry", "Jeff", "Mark", "Tim", "Sundar")

            assertEquals(listOf("Steve", "Larry", "Sundar"), names)
        }

        @Test
        fun `Filter only people born before 1960`() {
            val names = mapOf(
                1971 to "Elon Musk",
                1955 to "Steve Jobs",
                1944 to "Larry Ellison"
            )

            assertEquals(mapOf(
                1955 to "Steve Jobs",
                1944 to "Larry Ellison"
            ), names)
        }

        @Test
        fun `Filter a map by the values`() {
            val names = mapOf(
                1971 to "Elon Musk",
                1955 to "Steve Jobs",
                1944 to "Larry Ellison"
            )

            assertEquals(mapOf(
                1971 to "Elon Musk",
                1944 to "Larry Ellison"
            ), names)
        }

        @Test
        fun `Filter by index`() {
            val nums = listOf(1,2,3,4,5)

            assertEquals(listOf(1,2,5), nums)
        }
    }
}