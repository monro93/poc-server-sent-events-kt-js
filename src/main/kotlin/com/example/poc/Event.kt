package com.example.poc

import java.time.LocalDateTime

data class Event(
    val date: LocalDateTime = LocalDateTime.now()
)
