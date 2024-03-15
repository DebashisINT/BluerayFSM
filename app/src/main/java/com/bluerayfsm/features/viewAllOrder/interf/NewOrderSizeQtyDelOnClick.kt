package com.bluerayfsm.features.viewAllOrder.interf

import com.bluerayfsm.app.domain.NewOrderGenderEntity
import com.bluerayfsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}