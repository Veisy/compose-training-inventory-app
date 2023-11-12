/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.inventory.data

import javax.inject.Inject

class OfflineItemsRepository @Inject constructor(
    private val itemDao: ItemDao,
) : ItemsRepository {
    override fun getAllItems() = itemDao.getAllItems()

    override fun getItem(itemId: Int) = itemDao.getItem(itemId)

    override suspend fun addItem(item: ItemEntity) = itemDao.insert(item)

    override suspend fun updateItem(item: ItemEntity) = itemDao.update(item)

    override suspend fun deleteItem(item: ItemEntity) = itemDao.delete(item)
}
