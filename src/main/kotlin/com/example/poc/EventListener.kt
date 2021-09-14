package com.example.poc

import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class EventListener(
    private val eventEmitter: EventEmitter
) {

    @EventListener
    fun handleEvent(event: Event) {
        eventEmitter.send("message: ${event.date}")
    }
}
