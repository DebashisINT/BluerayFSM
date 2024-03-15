package com.bluerayfsm.features.newcollection.model

import com.bluerayfsm.app.domain.CollectionDetailsEntity
import com.bluerayfsm.base.BaseResponse
import com.bluerayfsm.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}