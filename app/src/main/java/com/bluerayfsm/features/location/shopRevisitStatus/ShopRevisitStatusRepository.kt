package com.bluerayfsm.features.location.shopRevisitStatus

import com.bluerayfsm.base.BaseResponse
import com.bluerayfsm.features.location.model.ShopDurationRequest
import com.bluerayfsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}