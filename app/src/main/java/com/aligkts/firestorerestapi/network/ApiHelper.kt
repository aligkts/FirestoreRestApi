package com.aligkts.firestorerestapi.network

import com.aligkts.firestorerestapi.network.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by Ali Göktaş on 18,June,2019
 */

interface ApiHelper {

    @GET("(default)/documents/user")
    fun getUser(): Call<UserResponse>

}