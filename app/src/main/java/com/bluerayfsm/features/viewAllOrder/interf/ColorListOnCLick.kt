package com.bluerayfsm.features.viewAllOrder.interf

import com.bluerayfsm.app.domain.NewOrderGenderEntity
import com.bluerayfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}