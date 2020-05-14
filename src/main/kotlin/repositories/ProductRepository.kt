package repositories

import model.Product

object ProductRepository {

    val list = listOf(
        Product(1, "Barbijo", 89.99f),
        Product(2, "Guantes", 50f),
        Product(3, "Jabón", 70f),
        Product(4, "Alcohol en gel", 300f)
    )
}