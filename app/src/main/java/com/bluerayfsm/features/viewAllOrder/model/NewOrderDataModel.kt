package com.bluerayfsm.features.viewAllOrder.model

import com.bluerayfsm.app.domain.NewOrderColorEntity
import com.bluerayfsm.app.domain.NewOrderGenderEntity
import com.bluerayfsm.app.domain.NewOrderProductEntity
import com.bluerayfsm.app.domain.NewOrderSizeEntity
import com.bluerayfsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

