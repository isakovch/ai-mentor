package com.example.demo.controller

import com.example.demo.model.db.UserEntity
import com.example.demo.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController {

    @Autowired
    private lateinit var userRepository: UserRepository

    @GetMapping("/all")
    fun getAllUsers(): ResponseEntity<List<UserEntity>> {
        val users = userRepository.findAll()
        return ResponseEntity(users, HttpStatus.OK)
    }
}