package model

data class Cart(
    val client: Client,
    val products: List<Pair<Product, Int>>)