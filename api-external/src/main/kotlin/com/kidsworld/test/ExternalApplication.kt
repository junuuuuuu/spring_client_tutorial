package com.kidsworld.test

import com.kidsworld.demo.client.common.annotation.EnableClient
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@EnableClient
@ConfigurationPropertiesScan
@SpringBootApplication
class ExternalApplication

fun main(args: Array<String>) {
	runApplication<ExternalApplication>(*args)
}
