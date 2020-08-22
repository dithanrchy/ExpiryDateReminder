package com.example.expirydatereminder.data

data class Med (
    var name: String = "",
    var buy_date: String = "",
    var exp_date: String = "",
    var photo: Int = 0,
    var qty: Int = 0
)

data class Food (
    var name: String = "",
    var buy_date: String = "",
    var exp_date: String = "",
    var photo: Int = 0,
    var qty: Int = 0
)

data class Skincare (
    var name: String = "",
    var buy_date: String = "",
    var exp_date: String = "",
    var photo: Int = 0,
    var qty: Int = 0
)