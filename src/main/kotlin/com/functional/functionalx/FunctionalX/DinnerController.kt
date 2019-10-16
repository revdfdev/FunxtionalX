package com.functional.functionalx.FunctionalX

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DinnerController {

    @GetMapping("/prepare-food")
    fun prepareFood() {

    }
}