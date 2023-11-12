package com.example.inventory.di

import com.example.inventory.data.ItemsRepository
import com.example.inventory.data.OfflineItemsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ItemModule {

    @Binds
    @Singleton
    abstract fun bindOfflineItemRepository(offlineItemsRepository: OfflineItemsRepository): ItemsRepository
}