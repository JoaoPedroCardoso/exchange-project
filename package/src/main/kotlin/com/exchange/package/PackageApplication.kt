package com.exchange.package

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PackageApplication

fun main(args: Array<String>) {
	runApplication<PackageApplication>(*args)
}
