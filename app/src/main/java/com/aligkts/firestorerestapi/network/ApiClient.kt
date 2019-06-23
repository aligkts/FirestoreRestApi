package com.aligkts.firestorerestapi.network

import com.aligkts.firestorerestapi.network.model.UserResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Retrofit request class
 */

class ApiClient {

     fun getUserFromApi(requestCallback: (isSuccess: Boolean, response: UserResponse?,message: String?) -> (Unit)) {
        RetrofitClient.getApi()
            .create(ApiHelper::class.java)
            .getUser()
            .enqueue(object : Callback<UserResponse> {

                override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                    requestCallback(false,null,t.localizedMessage)
                }

                override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                    response.body()?.let { _modelResponse ->
                        requestCallback(true, _modelResponse,null)
                    }
                }
            })
    }

}