package com.bluerayfsm.features.lead.api

import com.bluerayfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.bluerayfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}