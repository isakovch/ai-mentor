package com.example.demo.model.common

import org.springframework.http.HttpStatus

data class CommonResponse<T>(
    val status: HttpStatus,
    val content: T
)