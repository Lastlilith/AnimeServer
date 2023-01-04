package com.imnidasoftware.plugins

import com.imnidasoftware.routes.getAllHeroes
import com.imnidasoftware.routes.root
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*

fun Application.configureRouting() {

    routing {
        root()
        getAllHeroes()

        static("/images") {
            resources("images")
        }
    }
}
