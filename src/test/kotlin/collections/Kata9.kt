package collections

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class Kata9 {
    // foreach, oneach, doOnEach, etc.

    @Nested
    inner class Actions {
        @Test
        fun `Execute each function in the list`() {
            val funs = listOf({ print("first") }, { print("second") })

            TODO()
        }

        @Test
        fun `Print each number in the list`() {
            val nums = listOf(5, 2, 1, 9, 2)

            TODO()
        }
    }

    @Nested
    inner class Checks {
        @Test
        fun `Find whether any number is divisble by 5`() {
            val nums = listOf(4, 232, 1094, -88)
            val isAnyDivisibleByFive = TODO()

            assertEquals(false, isAnyDivisibleByFive)
        }

        @Test
        fun `Find whether nms1 contains all elements of nums2`() {
            val nums1 = listOf(76, 1, 45, 2, 7, 90, 24, 55, 27)
            val nums2 = listOf(90, 1, 55, 27)
            val num1ContainsNums2 = TODO()

            assertEquals(true, num1ContainsNums2)
        }

        @Test
        fun `Does the string contain the character a`() {
            val name = "Pratik"
            val containsA = TODO()

            assertEquals(true, containsA)
        }

        @Test
        fun `Does the map contain the key 3`() {
            val numsMap = mapOf(
                2 to "Steve",
                4 to "Barry",
                8 to "John"
            )
            val contains3 = TODO()

            assertEquals(false, contains3)
        }

        @Test
        fun `Find if all numbers are even`() {
            val nums = listOf(4, 232, 1094, -88)
            val areAllNumsEven = TODO()

            assertEquals(true, areAllNumsEven)
        }

        @Test
        fun `Find if none of the numbers in a list are negative`() {
            val nums = listOf(7, 4, -9, 4, -7, 0)
            val noneAreNegative = nums.none { it < 0 }

            assertEquals(false, noneAreNegative)
        }

        @Test
        fun `Check if the list is empty`() {
            val nums = listOf<Int>()
            val isEmpty = TODO()

            assertEquals(true, isEmpty)
        }

        @Test
        fun `Check if the list is not empty`() {
            val nums = listOf<Int>()
            val isNotEmpty = TODO()

            assertEquals(false, isNotEmpty)
        }
    }
}