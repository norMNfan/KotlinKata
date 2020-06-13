package collections

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.time.LocalDate

class Kata3 {
    @Test
    fun `Map a String to its length`() {
        val names = listOf("Steve", "Elon", "Larry", "Jeff", "Mark", "Tim", "Sundar")

        assertEquals(listOf(5, 4, 5, 4, 4, 3, 6), names)
    }

    @Test
    fun `Map a date to its year`() {
        val dates = listOf(
            LocalDate.of(1971,2,2),
            LocalDate.of(1980,5,6),
            LocalDate.of(1999,1,14),
            LocalDate.of(1957,9,3),
            LocalDate.of(2034,10,29)
        )

        assertEquals(listOf(1971, 1980, 1999, 1956, 2034), dates)
    }

    @Test
    fun `Map all not null`() {
        val nums = listOf(3,null,6,1,null)

        assertEquals(listOf(3, 6, 1), nums)
    }

    @Test
    fun `mapKeys | Add one to the key of each entry`() {
        val names = mapOf(
            1971 to "Elon Musk",
            1955 to "Steve Jobs",
            1944 to "Larry Ellison"
        )

        assertEquals(
            mapOf(
                1972 to "Elon Musk",
                1956 to "Steve Jobs",
                1945 to "Larry Ellison"
            ), names
        )
    }

    @Test
    fun `mapValues | Add one to the value of each entry`() {
        val names = mapOf(
            1971 to "Elon Musk",
            1955 to "Steve Jobs",
            1944 to "Larry Ellison"
        )

        assertEquals(
            mapOf(
                1971 to "No name",
                1955 to "No name",
                1944 to "No name"
            ), names
        )
    }

    @Test
    fun `mapIndexed | Add +1 to every even numbered index`() {
        val nums = listOf(1,2,3,4,5,6,7,8,9,10)

        assertEquals(listOf(2,2,4,4,6,6,8,8,10,10), nums)
    }

    @Test
    fun `flatten | Flatten a list of lists`() {
        val nums = listOf(
            listOf(1, 2, 3),
            listOf(4, 5, 6),
            listOf(7, 8, 9)
        )

        assertEquals(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9), nums)
    }

    @Test
    fun `flatMap | Flatten a list of Strings to their size`() {
        val names = listOf(
            listOf("Timothy", "Peter", "John"),
            listOf("Andrew", "Simon")
        )

        assertEquals(listOf(7,5,4,6,5), names)
    }

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
}