package com.aligkts.firestorerestapi.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Retrofit base
 */

class RetrofitClient {


    companion object {
        const val baseUrl = "https://firestore.googleapis.com/v1/projects/firestorerestapi/databases/"
        fun getApi(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }

}

