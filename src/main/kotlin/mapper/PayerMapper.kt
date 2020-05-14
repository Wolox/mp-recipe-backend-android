package mapper

import com.mercadopago.resources.datastructures.preference.Payer
import model.Client

fun Client.toPayer() = Payer()
    .setEmail(email)
    .setName(name)