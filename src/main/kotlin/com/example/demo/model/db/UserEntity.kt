package com.example.demo.model.db

import com.example.demo.model.UserRoleType
import org.springframework.data.annotation.Id

data class UserEntity(
    val email: String,
    val password: String,
    val role: UserRoleType
) {

    @Id
    lateinit var userId: String
}


