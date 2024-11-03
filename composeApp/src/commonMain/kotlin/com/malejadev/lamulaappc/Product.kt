package com.malejadev.lamulaappc

data class Product(
    val id: Int,
    val name: String,
    val unit_cost: Number,
    val description: String,
    val imageUrl: String
)

val products = (1..99).map {
    Product(
        id = it,
        name = "Product $it",
        description = "Description $it",
        unit_cost = 10.0,
        imageUrl = "https://picsum.photos/200/300?id=$it"
    )
}
