package com.example.poc

import org.springframework.web.servlet.mvc.method.annotation.SseEmitter

class EventEmitter: SseEmitter(3600000) {

}
