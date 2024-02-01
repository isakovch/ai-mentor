package com.example.demo.repository

import com.example.demo.model.db.UserEntity
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<UserEntity, String>