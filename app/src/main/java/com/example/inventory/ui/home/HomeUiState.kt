package com.example.inventory.ui.home

import com.example.inventory.data.ItemEntity

/**
 * Ui State for HomeScreen
 */
data class HomeUiState(
    val isLoading: Boolean = false,
    val itemList: List<ItemEntity> = listOf()
)