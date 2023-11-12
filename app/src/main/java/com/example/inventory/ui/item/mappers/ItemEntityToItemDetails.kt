package com.example.inventory.ui.item.mappers

import com.example.inventory.data.ItemEntity
import com.example.inventory.ui.item.item_detail.ItemDetails

/**
 * Extension function to convert [ItemEntity] to [ItemDetails]
 */
fun ItemEntity.toItemDetails(): ItemDetails = ItemDetails(
    id = id,
    name = name,
    price = price.toString(),
    quantity = quantity.toString()
)