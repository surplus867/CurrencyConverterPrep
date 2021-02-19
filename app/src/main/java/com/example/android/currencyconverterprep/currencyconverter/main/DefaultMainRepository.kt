package com.example.android.currencyconverterprep.currencyconverter.main

import com.example.android.currencyconverterprep.currencyconverter.data.CurrencyApi
import com.example.android.currencyconverterprep.currencyconverter.models.CurrencyResponse
import com.example.android.currencyconverterprep.currencyconverter.util.Resource
import java.lang.Exception
import javax.inject.Inject

class DefaultMainRepository @Inject constructor(
    private val api: CurrencyApi
) : MainRepository {

    override suspend fun getRates(base: String): Resource<CurrencyResponse> {
        return try {
            val response = api.getRates(base)
            val result = response.body()
            if(response.isSuccessful && result !=null) {
                Resource.Success(result)
            } else {
                Resource.Error(response.message())
            }
        } catch (e: Exception) {
            Resource.Error(e.message ?: "An error occur")
        }
    }
}