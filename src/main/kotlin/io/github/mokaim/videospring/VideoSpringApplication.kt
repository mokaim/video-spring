package io.github.mokaim.videospring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VideoSpringApplication

fun main(args: Array<String>) {
    runApplication<VideoSpringApplication>(*args)
}
