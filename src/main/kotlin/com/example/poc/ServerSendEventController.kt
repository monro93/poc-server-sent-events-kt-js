package com.example.poc

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter

@Controller
class ServerSendEventController(
    val eventEmitter: EventEmitter
) {
    @GetMapping("/emitter")
    fun eventEmitter(): SseEmitter {
        return eventEmitter
    }
}
