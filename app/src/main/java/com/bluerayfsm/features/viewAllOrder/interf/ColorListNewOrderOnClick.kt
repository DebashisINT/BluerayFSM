package com.bluerayfsm.features.viewAllOrder.interf

import com.bluerayfsm.app.domain.NewOrderColorEntity
import com.bluerayfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}