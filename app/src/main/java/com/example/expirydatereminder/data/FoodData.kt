package com.example.expirydatereminder.data

import com.example.expirydatereminder.R

object FoodData{
    private val foodName = arrayOf("Aqua Botol",
        "Buavita Mangga",
        "Coklat Batang",
        "Indomilk",
        "Mi Goreng",
        "Nanas",
        "Pisang",
        "Roti Gandum",
        "Saus Spaghetti",
        "Telur")

    private val foodBuyDate = arrayOf(
        "01-05-2020",
        "03-01-2020",
        "05-03-2020",
        "07-03-2020",
        "08-03-2020",
        "09-05-2020",
        "11-05-2020",
        "13-07-2020",
        "15-06-2020",
        "21-02-2020")

    private val foodExpDate = arrayOf(
        "01-05-2021",
        "03-01-2021",
        "05-03-2021",
        "07-03-2021",
        "08-03-2021",
        "09-05-2021",
        "11-05-2021",
        "13-07-2021",
        "15-06-2021",
        "21-02-2021")

    private val foodQty = arrayOf(1,2,3,4,5,6,7,8,9,10)

    private val foodImages = intArrayOf(
        R.drawable.food_aqua,
        R.drawable.food_buavita,
        R.drawable.food_coklat_batang,
        R.drawable.food_indomilk_banana,
        R.drawable.food_mi_goreng,
        R.drawable.food_nanas,
        R.drawable.food_pisang,
        R.drawable.food_roti_gandum,
        R.drawable.food_spaghetti_sauce,
        R.drawable.food_telur
    )

    val listFood: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodName.indices) {
                val data = Food()
                data.name = foodName[position]
                data.buy_date = foodBuyDate[position]
                data.exp_date = foodExpDate[position]
                data.qty = foodQty[position]
                data.photo = foodImages[position]
                list.add(data)
            }
            return list
        }

}