package com.bluerayfsm.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.bluerayfsm.app.FileUtils
import com.bluerayfsm.base.BaseResponse
import com.bluerayfsm.features.NewQuotation.model.*
import com.bluerayfsm.features.addshop.model.AddShopRequestData
import com.bluerayfsm.features.addshop.model.AddShopResponse
import com.bluerayfsm.features.damageProduct.model.DamageProductResponseModel
import com.bluerayfsm.features.damageProduct.model.delBreakageReq
import com.bluerayfsm.features.damageProduct.model.viewAllBreakageReq
import com.bluerayfsm.features.login.model.userconfig.UserConfigResponseModel
import com.bluerayfsm.features.myjobs.model.WIPImageSubmit
import com.bluerayfsm.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}