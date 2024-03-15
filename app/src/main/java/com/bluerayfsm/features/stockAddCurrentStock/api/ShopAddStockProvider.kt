package com.bluerayfsm.features.stockAddCurrentStock.api

import com.bluerayfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.bluerayfsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}