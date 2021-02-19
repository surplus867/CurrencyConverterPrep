package com.example.android.currencyconverterprep.currencyconverter.main

import com.example.android.currencyconverterprep.currencyconverter.models.CurrencyResponse
import com.example.android.currencyconverterprep.currencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}