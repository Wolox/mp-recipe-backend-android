package controller

import io.ktor.application.ApplicationCall
import io.ktor.response.respond
import repositories.ProductRepository

class ProductController {

    suspend fun list(call: ApplicationCall) = call.respond(ProductRepository.list)
}