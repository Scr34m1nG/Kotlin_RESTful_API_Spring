package com.belajar.kotlinrestfulapi.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.Date

@Entity
@Table(name = "products")
data class Product( // create table in database

    @Id
    val id: String,

    @Column(name = "name")
    var name: String,

    @Column(name = "price")
    var price: Long,

    @Column(name = "quantity")
    var quantity: Int,

    @Column(name = "createdAt")
    val createdAt: Date,

    @Column(name = "updateAt")
    var updatedAt: Date?

)
