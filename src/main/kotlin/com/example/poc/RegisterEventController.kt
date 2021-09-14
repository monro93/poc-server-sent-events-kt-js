package com.example.poc

import org.springframework.context.ApplicationEventPublisher
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class RegisterEventController(
    private val applicationEventPublisher: ApplicationEventPublisher
) {
    @GetMapping("/register-event")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun registerEvent() {
        applicationEventPublisher.publishEvent(Event())
    }
}
