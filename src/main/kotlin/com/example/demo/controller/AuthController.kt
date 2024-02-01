//package com.example.demo.controller
//
//import com.example.demo.model.TokenData
//import com.example.demo.model.UserRoleType
//import com.example.demo.model.db.UserEntity
//import com.example.demo.repository.UserRepository
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.http.HttpStatus
//import org.springframework.http.HttpStatusCode
//import org.springframework.http.ResponseEntity
//import org.springframework.web.bind.annotation.PostMapping
//import org.springframework.web.bind.annotation.RequestBody
//import org.springframework.web.bind.annotation.RequestMapping
//import org.springframework.web.bind.annotation.RestController
//
//@RestController
//@RequestMapping("/api")
//class AuthController {
//
//    @Autowired
//    private lateinit var userRepository: UserRepository
//
//    @PostMapping("/register")
//    fun registerUser(@RequestBody registrationRequest: RegistrationRequest): ResponseEntity<TokenData> {
//        val userEntity = UserEntity(
//            email = registrationRequest.email,
//            password = registrationRequest.password,
//            role = registrationRequest.role
//        )
//
//        userRepository.save(userEntity)
//
//        val tokenData = TokenData(
//            accessToken = "sometoken",
//            refreshToken = "refreshtoken"
//        )
//
//        val index = tokenData.accessToken.lastIndexOf("sometoken")
//
//        return ResponseEntity(tokenData, HttpStatus.OK)
//    }
//
//    @PostMapping("/login")
//    fun loginUser(@RequestBody loginRequest: LoginRequest): ResponseEntity<Any> {
//        // Implement login logic
//        return ResponseEntity.ok().body("User logged in successfully")
//    }
//}
//
//data class RegistrationRequest(
//    val email: String,
//    val password: String,
//    val role: UserRoleType
//)
//
//data class LoginRequest(
//    val email: String,
//    val password: String
//)
