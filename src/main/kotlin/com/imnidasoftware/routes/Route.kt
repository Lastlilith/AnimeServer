package com.imnidasoftware.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.routing.*
import io.ktor.server.response.*

fun Route.root() {
    get("/") {
        call.respond(
            message = "Welcome to Anime API",
            status = HttpStatusCode.OK
        )
    }
}