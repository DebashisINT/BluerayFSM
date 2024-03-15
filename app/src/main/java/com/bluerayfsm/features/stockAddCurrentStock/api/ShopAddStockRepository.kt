package com.bluerayfsm.features.stockAddCurrentStock.api

import com.bluerayfsm.base.BaseResponse
import com.bluerayfsm.features.location.model.ShopRevisitStatusRequest
import com.bluerayfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.bluerayfsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.bluerayfsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.bluerayfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}