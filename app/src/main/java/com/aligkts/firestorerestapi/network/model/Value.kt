package com.aligkts.firestorerestapi.network.model

import com.google.gson.annotations.SerializedName

data class Value(

	@field:SerializedName("stringValue")
	val stringValue: String? = null
)