package com.ibartuszek.apartmentspider

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApartmentSpiderApplication

fun main(args: Array<String>) {
	runApplication<ApartmentSpiderApplication>(*args)
}
