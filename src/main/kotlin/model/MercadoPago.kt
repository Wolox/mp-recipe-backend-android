package model

import com.mercadopago.MercadoPago;
import com.mercadopago.resources.Preference
import mapper.toCheckoutPreference
import mapper.toItem
import mapper.toPayer

object MercadoPago {

    private const val ACCESS_TOKEN = "INSERT_YOUR_ACCESS_TOKEN"

    init {
        MercadoPago.SDK.setAccessToken(ACCESS_TOKEN)
    }

    fun checkout(cart: Cart) = Preference()
        .setPayer(cart.client.toPayer())
        .setItems(ArrayList(cart.products.map { it.toItem() }))
        .save()
        .toCheckoutPreference()
}
