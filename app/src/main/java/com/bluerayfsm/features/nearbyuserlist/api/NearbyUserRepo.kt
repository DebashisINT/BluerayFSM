package com.bluerayfsm.features.nearbyuserlist.api

import com.bluerayfsm.app.Pref
import com.bluerayfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.bluerayfsm.features.newcollection.model.NewCollectionListResponseModel
import com.bluerayfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}