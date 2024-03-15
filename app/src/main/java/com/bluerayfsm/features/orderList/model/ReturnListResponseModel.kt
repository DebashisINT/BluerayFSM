package com.bluerayfsm.features.orderList.model

import com.bluerayfsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}