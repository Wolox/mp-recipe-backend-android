package exception

class ProductNotFoundException(productId: Long) : MercadoPagoException("model.Product with id $productId doesn't exists")
