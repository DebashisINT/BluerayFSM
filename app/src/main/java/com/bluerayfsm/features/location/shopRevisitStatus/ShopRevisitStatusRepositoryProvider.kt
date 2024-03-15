package com.bluerayfsm.features.location.shopRevisitStatus

import com.bluerayfsm.features.location.shopdurationapi.ShopDurationApi
import com.bluerayfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}