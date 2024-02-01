package com.example.demo.controller

import com.example.demo.model.db.UserEntity
import com.example.demo.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/auth")
class AuthController {

    @Autowired
    private lateinit var userRepository: UserRepository

    @PostMapping("/create-user")
    fun registerUser(@RequestBody userEntity: UserEntity) {
        userRepository.save(userEntity)
    }
}