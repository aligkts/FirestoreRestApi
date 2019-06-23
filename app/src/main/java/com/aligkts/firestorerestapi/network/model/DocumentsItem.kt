package com.aligkts.firestorerestapi.network.model

import com.google.gson.annotations.SerializedName

data class DocumentsItem(

	@field:SerializedName("createTime")
	val createTime: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("updateTime")
	val updateTime: String? = null,

	@field:SerializedName("fields")
	val fields: Fields? = null
)