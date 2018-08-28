package com.poolsawat.mediumkotlin

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAutoConfiguration
class MediumKotlinApplication

fun main(args: Array<String>) {
    runApplication<MediumKotlinApplication>(*args)
}
