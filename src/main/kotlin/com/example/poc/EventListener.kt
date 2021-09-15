package com.example.poc

import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class EventListener(
    private val eventEmittersOrchestrator: EventEmittersOrchestrator
) {

    @EventListener
    fun handleEvent(event: Event) {
        eventEmittersOrchestrator.send("message: ${event.date}")
    }
}
