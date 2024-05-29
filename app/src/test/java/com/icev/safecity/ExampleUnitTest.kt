package com.icev.safecity

//import com.icev.safecity.client.UserClient
//import io.ktor.client.statement.bodyAsText
//import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
//        runBlocking {
//            val client = UserClient.build()
//            println("AAAAAAAAAAAAAAAAA")
//            try {
//                val data = client.findUser("ab", "cd")
//                println(data.bodyAsText())
//                println(data.headers)
//            } catch (err: Exception) {
//                println(err.message)
//            } finally {
//                exitProcess(1)
            }
        }
//    }
//}