package com.imnidasoftware.routes

import com.imnidasoftware.models.ApiResponse
import com.imnidasoftware.repository.HeroRepositoryAlternative
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllHeroesAlt() {
    val heroRepositoryAlt: HeroRepositoryAlternative by inject()

    get("/anime/heroes") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            val limit = call.request.queryParameters["limit"]?.toInt() ?: 4

            val apiResponse = heroRepositoryAlt.getAllHeroes(page = page, limit = limit)
            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )
        } catch (e: NumberFormatException) {
            call.respond(
                message = ApiResponse(success = false, message = "Only numbers allowed"),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = ApiResponse(success = false, message = "Heroes not found"),
                status = HttpStatusCode.NotFound
            )
        }
    }
}