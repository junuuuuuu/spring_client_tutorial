package com.kidsworld.test

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    @GetMapping
    fun hello() = "hello"
}