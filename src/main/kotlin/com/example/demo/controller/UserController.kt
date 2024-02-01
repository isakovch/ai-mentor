package com.example.demo.controller

import com.example.demo.model.db.UserEntity
import com.example.demo.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class UserController {

    @Autowired
    private lateinit var userRepository: UserRepository

    @GetMapping("/register-user")
    fun registerUser(@RequestBody userEntity: UserEntity): ResponseEntity<UserEntity> {
        userRepository.save(userEntity)

        return ResponseEntity(HttpStatus.OK)
    }

    @GetMapping("/all-users")
    fun getAllUsers(): ResponseEntity<List<UserEntity>> {
        val users = userRepository.findAll()
        return ResponseEntity(users, HttpStatus.OK)
    }
}