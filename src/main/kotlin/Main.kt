import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.gson.gson
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main() {

    val server = embeddedServer(Netty, port = System.getenv("PORT")?.toInt() ?: 8080) {

        val router = Router(this)

        install(ContentNegotiation) {
            gson {}
        }

        router.initRouter()
    }
    server.start(wait = true)
}
