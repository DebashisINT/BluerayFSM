package com.bluerayfsm.features.dashboard.presentation.api.dayStartEnd

import com.bluerayfsm.app.Pref
import com.bluerayfsm.base.BaseResponse
import com.bluerayfsm.features.dashboard.presentation.model.DaystartDayendRequest
import com.bluerayfsm.features.dashboard.presentation.model.StatusDayStartEnd
import com.bluerayfsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.bluerayfsm.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }

    fun daystartendDelete(sessionToken:String,usrID:String,date:String,dayStDel:String,dayEndDel:String): Observable<BaseResponse> {
        return apiService.submitDayStartEndDelApi(sessionToken,usrID,date,dayStDel,dayEndDel)
    }


}