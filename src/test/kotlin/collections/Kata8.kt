package collections

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class Kata8 {
    // distinct, union, intersect, single

    @Nested
    inner class DistinctIntersectionUnion {
        @Test
        fun `Find all distinct elements of a list of numbers`() {
            val nums = listOf(6,5,6,1,5,7,8,6,6,2,5,1)
            val distinctNums = TODO()

            assertEquals(listOf(6,5,1,7,8,2), distinctNums)
        }

        @Test
        fun `Find the common elements, the intersection, of two lists`() {
            val nums1 = listOf(1,5,6,8,7)
            val nums2 = listOf(10,9,1,7,2)
            val intersection = TODO()

            assertEquals(listOf(1,7), intersection)
        }

        @Test
        fun `Find the union of two lists`() {
            val nums1 = listOf(1,5,6,8,7)
            val nums2 = listOf(10,9,1,7,2)
            val union = TODO()

            assertEquals(setOf(1,5,6,8,7,10,9,2), union)
        }
    }

    @Nested
    inner class Find {
        @Test
        fun `Perform a binary search on a  list of numbers to find if 8 exists`() {
            val nums = listOf(6,5,9,56,24,21,17,8,45,6,23,5,1)
            val does8exist = TODO()

            assertEquals(true, does8exist)
        }

        @Test
        fun `Find the first element that is negative`() {
            val nums = listOf(6,5,-9,56,24,-21,17,8,45,-6,23,5,1)
            val firstNegativeNumber = TODO()

            assertEquals(-9, firstNegativeNumber)
        }

        @Test
        fun `Find the last element that is negative`() {
            val nums = listOf(6,5,-9,56,24,-21,17,8,45,-6,23,5,1)
            val lastNegativeNumber = TODO()

            assertEquals(-6, lastNegativeNumber)
        }
    }
}