package com.example.expirydatereminder.data

import com.example.expirydatereminder.R

object SkincareData{
    private val scareName = arrayOf("Aloe Vera Gel",
        "Cleanser",
        "Facial Wash",
        "Hand Cream",
        "Body Lotion",
        "Micellar Water",
        "Moisturizer",
        "Ointment",
        "Sunscreen",
        "Toner")

    private val scareBuyDate = arrayOf(
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

    private val scareExpDate = arrayOf(
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

    private val scareQty = arrayOf(1,1,1,1,1,1,1,1,1,1)

    private val scareImages = intArrayOf(
        R.drawable.scare_aloevera_gel,
        R.drawable.scare_cleanser,
        R.drawable.scare_facial_wash,
        R.drawable.scare_hand_cream,
        R.drawable.scare_lotion,
        R.drawable.scare_micellar_water,
        R.drawable.scare_moisturizer,
        R.drawable.scare_ointment,
        R.drawable.scare_sunscreen,
        R.drawable.scare_toner
    )

    val listSkincare: ArrayList<Skincare>
        get() {
            val list = arrayListOf<Skincare>()
            for (position in scareName.indices) {
                val data = Skincare()
                data.name = scareName[position]
                data.buy_date = scareBuyDate[position]
                data.exp_date = scareExpDate[position]
                data.qty = scareQty[position]
                data.photo = scareImages[position]
                list.add(data)
            }
            return list
        }

}