package mapper

import exception.ProductNotFoundException
import model.Cart
import model.CartFront
import model.Product

fun CartFront.toCart(productList: List<Product>) = Cart(
    client,
    products.map { product ->
        productList.firstOrNull { it.id == product.first }
            ?.let { it to product.second }
            ?: throw ProductNotFoundException(product.first)
    })