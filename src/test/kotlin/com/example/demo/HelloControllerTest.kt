package com.example.demo


import org.hamcrest.Matchers.containsString
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerTest {

    @Autowired
    private lateinit var mvc: MockMvc

    @Test
    @Throws(Exception::class)
    fun greetingTest() {
        val requestBuilder = MockMvcRequestBuilders.get("/api/greeting")
            .accept(MediaType.APPLICATION_JSON)


        mvc.perform(requestBuilder)
            .andExpect(status().isOk)
            .andExpect(content().string(containsString("Hello")))
    }
}