package com.imnidasoftware.plugins

import com.imnidasoftware.routes.getAllHeroes
import com.imnidasoftware.routes.root
import com.imnidasoftware.routes.searchHeroes
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*

fun Application.configureRouting() {

    routing {
        root()
        getAllHeroes()
        searchHeroes()
        static("/images") {
            resources("images")
        }
    }
}
