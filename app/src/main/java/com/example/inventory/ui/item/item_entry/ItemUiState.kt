package com.example.inventory.ui.item.item_entry

import com.example.inventory.ui.item.item_detail.ItemDetails

/**
 * Represents Ui State for an Item.
 */
data class ItemUiState(
    val isLoading: Boolean = false,
    val itemDetails: ItemDetails = ItemDetails(),
    val isEntryValid: Boolean = false
)