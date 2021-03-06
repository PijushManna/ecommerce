package com.blogspot.ecommerce_pijush.models

import com.blogspot.ecommerce_pijush.database.RoomProduct

data class Product(
    val id: String,
    val name: String,
    val type: String,
    val imgSrc: String,
    val price: Double,
    val discount: Double,
    val rating: Float,
    val ratingCount: Int,
    val trusted: Boolean,
    val shippingCost: Double
){
    constructor() : this("", "", "", "", 0.0, 0.0, 0f, 0, false, 0.0)
    fun asDomainModel():RoomProduct{
        return RoomProduct(
            id,
            name,
            type,
            imgSrc,
            price,
            discount,
            rating,
            ratingCount,
            trusted,
            shippingCost
        )
    }
}

fun List<Product>.asDomainModel(): List<RoomProduct>{
    return map {
        RoomProduct(
            it.id,
            it.name,
            it.type,
            it.imgSrc,
            it.price,
            it.discount,
            it.rating,
            it.ratingCount,
            it.trusted,
            it.shippingCost
        )
    }
}
