package com.bluerayfsm.features.viewAllOrder.orderOptimized

import com.bluerayfsm.app.domain.ProductOnlineRateTempEntity
import com.bluerayfsm.base.BaseResponse
import com.bluerayfsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}