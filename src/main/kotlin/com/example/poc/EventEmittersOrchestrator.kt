package com.example.poc

import java.io.IOException
import org.springframework.stereotype.Component

@Component
class EventEmittersOrchestrator(
    private val emitters: MutableMap<String, EventEmitter> = HashMap()
) {

    fun registerNewEmitter(userId: String): EventEmitter {
        val emitter = EventEmitter()
        emitter.onCompletion { emitters.remove(userId) }
        emitter.onTimeout { emitters.remove(userId) }
        emitter.onError { emitters.remove(userId) }

        emitters[userId] = emitter

        return emitter
    }

    fun send(message: String) {
        for (emitter in emitters) {
            try {
                emitter.value.send(message)
            }catch (e: IOException) {
                emitters.remove(emitter.key)
            }
        }
    }
}
