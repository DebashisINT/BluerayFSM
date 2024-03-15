package com.bluerayfsm.features.dashboard.presentation.api.dayStartEnd

import com.bluerayfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.bluerayfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}