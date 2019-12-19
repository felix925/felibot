package jp.making.felix

import io.ktor.application.call
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.post
import io.ktor.response.respondText
import io.ktor.routing.Route

@KtorExperimentalLocationsAPI
fun Route.index() {
    post<Index> {
        val response = SlackResponse(
            "in_channel",
            "you are fool"
        )
    }
}