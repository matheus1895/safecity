package com.icev.safecity.dto

import kotlinx.serialization.Serializable

@Serializable
data class UserDto(
    val email: String,
    val username: String,
    val password: String,
)