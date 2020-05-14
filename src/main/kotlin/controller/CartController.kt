package controller

import io.ktor.application.ApplicationCall
import io.ktor.http.HttpStatusCode
import io.ktor.request.receiveOrNull
import io.ktor.response.respond
import mapper.toCart
import model.CartFront
import model.MercadoPago
import repositories.ProductRepository

class CartController {

    suspend fun checkout(call: ApplicationCall) {
        try {
            val cart = call
                .receiveOrNull<CartFront>()
                ?.toCart(ProductRepository.list)
                ?: return call.respond(HttpStatusCode.BadRequest) // I don't care why it's a bad request, I'll just inform it.

            call.respond(MercadoPago.checkout(cart))
        } catch (e: Throwable) {
            // I don't care what happened here, I'll just inform it.
            call.respond(HttpStatusCode(500, e.message ?: ":("))
        }
    }
}