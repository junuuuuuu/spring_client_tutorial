package com.kidsworld.test

import com.kidsworld.demo.client.test.client.TestClient
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker
import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.time.LocalTime

@RestController
class TestController(
    private val testClient: TestClient
) {
    val logger = KotlinLogging.logger{}
    @CircuitBreaker(name = "testClient", fallbackMethod = "helloFallBack")
    @GetMapping("/test/{params}")
    fun hello(@PathVariable params:String): String{
        val result = testClient.requestDasSample(params)
        logger.info {"Time: ${LocalTime.now()}, result: $result"}
        return "Time: ${LocalTime.now()}, result: $result"
    }

    private fun helloFallBack(
        e: Throwable
    ): String{
        logger.info {"Time: ${LocalTime.now()}, test Server is down"}
        return "\"Time: ${LocalTime.now()}, test Server is down"
    }
}