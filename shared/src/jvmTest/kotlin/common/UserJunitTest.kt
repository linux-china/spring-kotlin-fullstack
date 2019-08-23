package common

import org.junit.Test

/**
 * user junit 5 test
 *
 * @author linux_china
 */
class UserJunitTest {

    @Test
    fun testOperation() {
        val user = User("libing", "chen")
        println("Hi ${user.firstName}")
    }
}