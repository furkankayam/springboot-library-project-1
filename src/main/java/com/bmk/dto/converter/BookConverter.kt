package com.bmk.dto.mapper

import com.bmk.dto.request.BookRequest
import com.bmk.dto.response.BookResponse
import com.bmk.model.Book

//Top-Level Functions (Üst Düzey Fonksiyonlar)

// Book --> BookResponse
fun Book.toBookResponse(): BookResponse {
    return BookResponse(
        name = this.name,
        author = this.author,
        page = this.page,
        createDate = this.createDate
    )
}

// BookRequest --> Book
fun BookRequest.toBook(): Book {
    return Book(
        name = this.name,
        author = this.author,
        page = this.page
    )
}
