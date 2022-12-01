package com.kidsworld.test

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    @GetMapping
    fun hello(): String{
        println("메서드가 호출되었습니다.")
        return "hello"
    }
}