package com.example.demo

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoApplication {

    @Bean
    fun commandLiner(context: ApplicationContext): CommandLineRunner {
        return CommandLineRunner {

        }
    }
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
