package com.example.inventory.ui.item.item_detail

/**
 * UI state for ItemDetailsScreen
 */
data class ItemDetailsUiState(
    val outOfStock: Boolean,
    val itemDetails: ItemDetails = ItemDetails()
)
