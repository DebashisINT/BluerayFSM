package com.bluerayfsm.features.login.model.productlistmodel

import com.bluerayfsm.app.domain.ModelEntity
import com.bluerayfsm.app.domain.ProductListEntity
import com.bluerayfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}