package com.kidsworld.test

import com.kidsworld.demo.client.test.client.TestClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    private val testClient: TestClient
) {
    @GetMapping
    fun hello(): String{
        return testClient.requestDasSample()
    }
}