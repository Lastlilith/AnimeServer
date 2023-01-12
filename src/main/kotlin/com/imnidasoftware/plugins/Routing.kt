package com.imnidasoftware.plugins

import com.imnidasoftware.routes.getAllHeroesAlt
import com.imnidasoftware.routes.root
import com.imnidasoftware.routes.searchHeroes
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {
        root()
        getAllHeroesAlt()
        searchHeroes()

        static("/images") {
            resources("images")
        }
    }
}
