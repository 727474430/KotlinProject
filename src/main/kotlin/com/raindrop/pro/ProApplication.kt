package com.raindrop.pro

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ProApplication

fun main(args: Array<String>) {
    SpringApplication.run(ProApplication::class.java, *args)
}
