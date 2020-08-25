package hu.aut.bme.springldapguide.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping("/")
    fun index(): String {
        return "Welcome to the home page!"
    }
}

