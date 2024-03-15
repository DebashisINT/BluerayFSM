package com.bluerayfsm.features.location.api

import com.bluerayfsm.features.location.shopdurationapi.ShopDurationApi
import com.bluerayfsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}