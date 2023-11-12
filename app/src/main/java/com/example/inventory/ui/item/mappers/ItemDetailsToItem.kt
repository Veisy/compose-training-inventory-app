package com.example.inventory.ui.item.mappers

import com.example.inventory.data.ItemEntity
import com.example.inventory.ui.item.item_detail.ItemDetails

/**
 * Extension function to convert [ItemDetails] to [ItemEntity]. If the value of [ItemDetails.price] is
 * not a valid [Double], then the price will be set to 0.0. Similarly if the value of
 * [ItemDetails.quantity] is not a valid [Int], then the quantity will be set to 0
 */
fun ItemDetails.toItem(): ItemEntity = ItemEntity(
    id = id,
    name = name,
    price = price.toDoubleOrNull() ?: 0.0,
    quantity = quantity.toIntOrNull() ?: 0
)