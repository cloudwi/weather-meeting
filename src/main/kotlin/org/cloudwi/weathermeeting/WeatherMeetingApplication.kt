package org.cloudwi.weathermeeting

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WeatherMeetingApplication

fun main(args: Array<String>) {
    runApplication<WeatherMeetingApplication>(*args)
}
