package com.bmk.dto.response

import java.util.*

data class BookResponse(
    val name: String,
    val author: String,
    val page: Int,
    val createDate: Date? = null
)