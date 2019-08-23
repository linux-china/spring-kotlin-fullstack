package common

import org.junit.jupiter.api.Test

/**
 * user junit 5 test
 *
 * @author linux_china
 */
class UserJunitTest {

    @Test
    fun testOperation() {
        val user = User("libingsww", "chen")
        println("Hi ${user.firstName}")
    }
}