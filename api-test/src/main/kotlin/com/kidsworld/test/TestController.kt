package com.kidsworld.test

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/test/{params}")
    fun hello(@PathVariable params: String): String{
        if(params != "1"){
            throw IllegalArgumentException("error")
        }
        return "This is Test Server"
    }
}