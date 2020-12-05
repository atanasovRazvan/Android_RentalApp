package com.example.android_rentalapp.todo.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "items")
data class Item(
    @PrimaryKey @ColumnInfo(name = "_id") val id: String,
    @ColumnInfo(name = "description") var description: String,
    @ColumnInfo(name = "price") var price: String,
    @ColumnInfo(name = "priceEstimation") var priceEstimation: String,
    @ColumnInfo(name = "ownerUsername") var ownerUsername: String
) {
    override fun toString(): String = "description: " + description + "; price: " + price + "; priceEstimation: " + priceEstimation + "; ownerUsername: " + ownerUsername
}