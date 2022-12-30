package com.oz.retrofitkotlin.service

import com.oz.retrofitkotlin.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET
import io.reactivex.Observable

interface CryptoAPI {
    //GET,POST,UPDATE,DELETE
    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData(): Observable<List<CryptoModel>>
}