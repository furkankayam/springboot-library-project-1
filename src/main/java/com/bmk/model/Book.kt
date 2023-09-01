package com.bmk.model

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UuidGenerator
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.util.*

@Entity
@Table(name = "books")
@EntityListeners(AuditingEntityListener::class)
data class Book(

    @Id
    @GeneratedValue
    @UuidGenerator(style = UuidGenerator.Style.TIME)
    val id: UUID? = null,

    @Column(unique = true, nullable = false)
    val name: String,

    @Column(nullable = false)
    val author: String,

    val page: Int,

    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    @Column(name = "create_date")
    val createDate: Date? = null

) {

}
