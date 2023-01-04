package com.imnidasoftware.plugins

import com.imnidasoftware.routes.root
import io.ktor.server.routing.*
import io.ktor.server.application.*

fun Application.configureRouting() {

    routing {
        root()
    }
}
