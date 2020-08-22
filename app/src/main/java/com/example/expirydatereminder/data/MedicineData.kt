package com.example.expirydatereminder.data

import com.example.expirydatereminder.R

object MedicineData{
    private val medName = arrayOf("Antalgin",
        "Asam Mefenamat",
        "Aspirin",
        "Captropril",
        "Dexamethasone",
        "Ibupofen",
        "Omeprazole",
        "Panadol",
        "Paracetamol",
        "Salbutamol")

    private val medBuyDate = arrayOf(
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

    private val medExpDate = arrayOf(
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

    private val medQty = arrayOf(1,2,3,4,5,6,7,8,9,10)

    private val medImages = intArrayOf(
        R.drawable.med_antalgin,
        R.drawable.med_asam_mefenamat,
        R.drawable.med_aspirin,
        R.drawable.med_captropril,
        R.drawable.med_dexamethasone,
        R.drawable.med_ibuprofen,
        R.drawable.med_omeprazole,
        R.drawable.med_panadol,
        R.drawable.med_paracetamol,
        R.drawable.med_salbutamol
    )

    val listMedicine: ArrayList<Med>
        get() {
            val list = arrayListOf<Med>()
            for (position in medName.indices) {
                val data = Med()
                data.name = medName[position]
                data.buy_date = medBuyDate[position]
                data.exp_date = medExpDate[position]
                data.qty = medQty[position]
                data.photo = medImages[position]
                list.add(data)
            }
            return list
        }

}