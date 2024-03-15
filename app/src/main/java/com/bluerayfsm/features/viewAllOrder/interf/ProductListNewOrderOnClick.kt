package com.bluerayfsm.features.viewAllOrder.interf

import com.bluerayfsm.app.domain.NewOrderGenderEntity
import com.bluerayfsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}