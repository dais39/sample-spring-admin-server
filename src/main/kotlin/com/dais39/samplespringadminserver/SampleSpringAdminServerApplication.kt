package com.dais39.samplespringadminserver

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableAdminServer
@SpringBootApplication
class SampleSpringAdminServerApplication

fun main(args: Array<String>) {
    runApplication<SampleSpringAdminServerApplication>(*args)
}
