package com.bluerayfsm.features.photoReg.present

import com.bluerayfsm.app.domain.ProspectEntity
import com.bluerayfsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}