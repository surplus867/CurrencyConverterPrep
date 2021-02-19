package com.example.android.currencyconverterprep.currencyconverter.models


data class CurrencyResponse(
    val base: String,
    val date: String,
    val rates: Rates
)