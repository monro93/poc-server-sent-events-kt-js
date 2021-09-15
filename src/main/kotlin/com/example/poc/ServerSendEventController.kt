package com.example.poc

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter

@Controller
class ServerSendEventController(
    private val eventEmittersOrchestrator: EventEmittersOrchestrator
) {
    @GetMapping("/emitter")
    fun eventEmitter(@RequestParam userId: String): SseEmitter {
        return eventEmittersOrchestrator.registerNewEmitter(userId)
    }
}
