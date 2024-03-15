package com.bluerayfsm.features.viewAllOrder.interf

import com.bluerayfsm.app.domain.NewOrderProductEntity
import com.bluerayfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}