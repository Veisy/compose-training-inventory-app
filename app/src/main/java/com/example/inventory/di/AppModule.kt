package com.example.inventory.di

import android.content.Context
import androidx.room.Room
import com.example.inventory.data.InventoryDatabase
import com.example.inventory.data.ItemDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideInventoryDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(context, InventoryDatabase::class.java, "inventory_database")
        .fallbackToDestructiveMigration()
        .build()

    @Provides
    @Singleton
    fun provideItemDao(inventoryDatabase: InventoryDatabase): ItemDao = inventoryDatabase.itemDao()
}