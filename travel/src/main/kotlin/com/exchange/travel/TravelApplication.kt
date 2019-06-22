package com.exchange.travel

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.context.config.annotation.RefreshScope

@SpringBootApplication
@RefreshScope
class TravelApplication

fun main(args: Array<String>) {
	runApplication<TravelApplication>(*args)
}
