package basic

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class Introduction {

    @Nested
    inner class `Variable Assignments` {
        @Test
        fun `Assign a String`() {
            val helloWorld: String = TODO("Assign me!")

            assertEquals(helloWorld, "Hello World!")
        }
    }
}