package com.bluerayfsm.features.newcollectionreport

import com.bluerayfsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}