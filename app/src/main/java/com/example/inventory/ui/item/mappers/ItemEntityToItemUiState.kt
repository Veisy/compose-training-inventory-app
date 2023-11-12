package com.example.inventory.ui.item.mappers

import com.example.inventory.data.ItemEntity
import com.example.inventory.ui.item.item_entry.ItemUiState

/**
 * Extension function to convert [ItemEntity] to [ItemUiState]
 */
fun ItemEntity.toItemUiState(
    isEntryValid: Boolean = false,
): ItemUiState = ItemUiState(
    itemDetails = this.toItemDetails(),
    isEntryValid = isEntryValid,
)

