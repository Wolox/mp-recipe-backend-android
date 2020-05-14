package mapper

import com.mercadopago.resources.Preference
import model.CheckoutPreference

fun Preference.toCheckoutPreference() = CheckoutPreference(id)