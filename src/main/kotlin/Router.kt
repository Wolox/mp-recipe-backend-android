import controller.CartController
import controller.ProductController
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.routing

class Router(private val application: Application) {

    private val cartController = CartController()
    private val productController = ProductController()

    fun initRouter() = application.routing {

        post("/checkout") { cartController.checkout(call) }

        get("/product") { productController.list(call) }
    }
}