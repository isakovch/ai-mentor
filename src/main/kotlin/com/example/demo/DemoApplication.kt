package com.example.demo

import com.example.demo.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoApplication {

    @Autowired
    private lateinit var repository: UserRepository

    @Bean
    fun commandLiner(context: ApplicationContext): CommandLineRunner {
        return CommandLineRunner {
            println("Hello there, we've launched")

            val itemsCount = repository.count()
            println("Database count: $itemsCount")
        }
    }
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
