package com.aligkts.firestorerestapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aligkts.firestorerestapi.network.ApiClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val apiClient by lazy { ApiClient() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        apiClient.getUserFromApi { isSuccess, response, message ->
            if (isSuccess) {
                val name = response?.documents?.first()?.fields?.name
                val surname = response?.documents?.first()?.fields?.surname
                name?.let { _name ->
                    txt_name.text = _name.stringValue
                }
                surname?.let { _surname ->
                    txt_surname.text = _surname.stringValue
                }

            } else {
                print(message)
            }
        }
    }

}
