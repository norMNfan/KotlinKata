import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import java.time.LocalDate

/*
    Let's learn about one of the most enjoyable parts of Kotlin, Collections!

    We are going to master the following methods

    Creating Collections
    listOf()
    emptyList()
    listOfNonNull()
    arrayOf()
    intArrayOf()
    setOf()
    emptySet()
    mapOf()
    emptyMap()
    mutableListOf()
    mutableSetOf()
    mutableMapOf()

    .filter { }
    .map { }
    .mapNotNull { }
    .mapKeys { }
    .mapValues { }
    .flatMap { }
    .flatten()
    .associate { }
    .reversed()
    .partition { }
    .zip()

    http://jussi.hallila.com/Kollections/


 */

class Collections {

    @Nested
    inner class `Creating Collections` {
        @Test
        fun `Create an empty list of Strings`() {
            val emptyListOfString = TODO()

            assertEquals(emptyListOfStringSolution, emptyListOfString)
        }

        @Test
        fun `Create an empty set of Strings`() {
            val emptySetOfString = TODO()

            assertEquals(emptySetOfStringSolution, emptySetOfString)
        }

        @Test
        fun `Create an int array with the elements 1, 2, 3`() {
            val numsOneTwoThree = TODO()

            assertEquals(numsOneTwoThreeSolution, numsOneTwoThree)
        }

        @Test
        fun `Create a map with the key-value pairs`() {
            val nameMap = TODO("""Create a map with the key-value pairs: "Steve":"Jobs" "Larry":"Ellison"""")

            assertEquals(nameMapSolution, nameMap)
        }

        @Test
        fun `Create a mutable list of Int`() {
            val mutableList = TODO()

            assertEquals(mutableListSolution, mutableList)
        }

        @Test
        fun `Create a mutable set of String`() {
            val mutableSet = TODO()

            assertEquals(mutableSetSolution, mutableSet)
        }
    }

    @Nested
    inner class Operators {
        @Test
        fun `+ | Add two lists together`() {
            val nums1 = listOf(1,2,3)
            val nums2 = listOf(4,5,6)
            val nums3 = TODO()

            assertEquals(listOf(1,2,3,4,5,6), nums3)
        }

        @Test
        fun `- | Remove an item from a list`() {
            val nums = listOf(1,2,3)

            assertEquals(listOf(1,2), nums)
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
    }

    @Nested
    inner class Mapping {
        @Test
        fun `map | Map a String to its length`() {
            val names = listOf("Steve", "Elon", "Larry", "Jeff", "Mark", "Tim", "Sundar")

            assertEquals(listOf(5,4,5,4,4,3,6), names)
        }

        @Test
        fun `map | Map a date to its year`() {
            val dates: List<LocalDate> = listOf(
                LocalDate.of(1971,2,2),
                LocalDate.of(1980,5,6),
                LocalDate.of(1999,1,14),
                LocalDate.of(1957,9,3),
                LocalDate.of(2034,10,29)
            )

            assertEquals(listOf(1971,1980,1999,1956,2034), dates)
        }

        @Test
        fun `mapNotNull | Map all not null`() {
            val nums = listOf(3,null,6,1,null)

            assertEquals(listOf(3,6,1), nums)
        }

        @Test
        fun `mapKeys | Add one to the key of each entry`() {
            val names = mapOf(
                1971 to "Elon Musk",
                1955 to "Steve Jobs",
                1944 to "Larry Ellison"
            )

            assertEquals(mapOf(
                1972 to "Elon Musk",
                1956 to "Steve Jobs",
                1945 to "Larry Ellison"
            ), names)
        }

        @Test
        fun `flatMap | Flatten a list of lists`() {
            val nums = listOf(
                listOf(1,2,3),
                listOf(4,5,6),
                listOf(7,8,9)
            )

            assertEquals(listOf(1,2,3,4,5,6,7,8,9), nums)
        }
    }

    @Nested
    inner class Miscellaneous {
        @Test
        fun `associateBy | Create a map with name as the and person as the value`() {
            val people = listOf(
                Person("Steve Jobs", 1956),
                Person("Elon Musk", 1972),
                Person("Larry Ellison", 1944)
            )

            assertEquals(mapOf(
                "Steve Jobs" to Person("Steve Jobs", 1956),
                "Elon Musk" to Person("Elon Musk", 1972),
                "Larry Ellison" to Person("Larry Ellison", 1944)
            ), people)
        }

        @Test
        fun `reversed | reverse a list of ints`() {
            val nums = listOf(4,6,7,10)

            assertEquals(listOf(10,7,6,4), nums)
        }
    }
}