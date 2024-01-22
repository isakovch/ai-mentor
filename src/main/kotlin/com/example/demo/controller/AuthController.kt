package com.example.demo.controller

import com.example.demo.model.UserRoleType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
class AuthController {

    @PostMapping("/register")
    fun registerUser(@RequestBody registrationRequest: RegistrationRequest): ResponseEntity<Any> {
        // Implement registration logic
        return ResponseEntity.ok().body("User registered successfully")
    }

    @PostMapping("/login")
    fun loginUser(@RequestBody loginRequest: LoginRequest): ResponseEntity<Any> {
        // Implement login logic
        return ResponseEntity.ok().body("User logged in successfully")
    }
}

data class RegistrationRequest(
    val email: String,
    val password: String,
    val role: UserRoleType
)

data class LoginRequest(
    val email: String,
    val password: String
)
