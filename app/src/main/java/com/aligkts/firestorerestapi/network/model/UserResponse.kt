package com.aligkts.firestorerestapi.network.model

import com.google.gson.annotations.SerializedName

data class UserResponse(

	@field:SerializedName("documents")
	val documents: List<DocumentsItem?>? = null
)