package com.icev.safecity.client

import com.icev.safecity.dto.UserDto
import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.DEFAULT
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.request.url
import io.ktor.client.statement.HttpResponse
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class UserClient ( private val client: HttpClient ) {
    suspend fun findUser(email: String, password: String): HttpResponse {
        return client.post {
            url("https://jsonplaceholder.typicode.com/posts")
            headers[HttpHeaders.ContentType] = ContentType.Application.Json.toString()
            setBody(UserDto(email, "ef", password))
        }
    }

    suspend fun saveUser(requestBody: UserDto): HttpResponse {
        return client.post {
            url("https://jsonplaceholder.typicode.com/posts")
            contentType(ContentType.Application.Json)
            setBody(requestBody)
        }
    }

    companion object {
        fun build(): UserClient {
            return UserClient(HttpClient(Android) {
                install(Logging) {
                    logger = Logger.DEFAULT
                    level = LogLevel.BODY
                }
                install(ContentNegotiation) {
                    json(
                        Json {
                            prettyPrint = true
                            isLenient = true
                        }
                    )
                }
            }
            )
        }
    }
}