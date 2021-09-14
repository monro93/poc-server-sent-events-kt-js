package com.example.poc

import org.springframework.stereotype.Service
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter

@Service
class EventEmitter: SseEmitter(3600000) {

}
