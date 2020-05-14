package mapper

import model.ProductQuantity

fun ProductQuantity.toItem() = com.mercadopago.resources.datastructures.preference.Item()
    .setTitle(first.name)
    .setUnitPrice(first.price)
    .setQuantity(second)