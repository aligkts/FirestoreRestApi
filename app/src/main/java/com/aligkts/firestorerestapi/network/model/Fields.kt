package com.aligkts.firestorerestapi.network.model

import com.google.gson.annotations.SerializedName

data class Fields(

	@field:SerializedName("surname")
	val surname: Value? = null,

	@field:SerializedName("name")
	val name: Value? = null
)