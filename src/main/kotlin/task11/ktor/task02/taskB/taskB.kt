package task11.ktor.task02.taskB

import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Location
import io.ktor.routing.Route
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import task11.ktor.task01.setupApplication
import task11.ktor.task02.CocktailDAO
import task11.ktor.task02.dataSource
import task11.ktor.task02.prepopulateDatabase


@Location("/api/cocktails")
class Cocktails

@KtorExperimentalLocationsAPI
fun main() {
    embeddedServer(Netty, 8089) {
        setupApplication()
        prepopulateDatabase(dataSource)

        val dao = CocktailDAO(dataSource)

        routing {
            cocktails(dao)
        }
    }.start(wait = true)
}

fun Route.cocktails(
    dao: CocktailDAO
) {
    // TODO - Add an endpoint for creating and adding new cocktails to the DB

}