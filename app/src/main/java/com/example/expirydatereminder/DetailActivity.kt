package com.example.expirydatereminder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextClock
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.expirydatereminder.data.*
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity() {

    private var listFood: ArrayList<Food> = arrayListOf()
    private var listMed: ArrayList<Med> = arrayListOf()
    private var listSkincare: ArrayList<Skincare> = arrayListOf()

    companion object{
        const val EXTRA_CATEGORY = "extra_category"
        const val EXTRA_POSITION = "extra_position"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.elevation = 0f
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val category = intent.getStringExtra(EXTRA_CATEGORY)
        val position = intent.getIntExtra(EXTRA_POSITION, 0)

        val tvTitleName: TextView = findViewById(R.id.tv_name)
        val imgItem: ImageView = findViewById(R.id.img_item)
        val tvCategory: TextView = findViewById(R.id.tv_category_detail)
        val tvName: TextView = findViewById(R.id.tv_name_detail)
        val tvQty: TextView = findViewById(R.id.tv_qty_detail)
        val tvBuyDate: TextView = findViewById(R.id.tv_buy_date_detail)
        val tvExpDate: TextView = findViewById(R.id.tv_exp_date_detail)

        when(category){
            "food" -> {
                supportActionBar?.title = "Detail Food"
                listFood.addAll(FoodData.listFood)

                tvTitleName.setText(listFood[position].name)
                imgItem.setImageResource(listFood[position].photo)
                tvCategory.setText("Food")
                tvName.setText(listFood[position].name)
                tvQty.setText((listFood[position].qty).toString())
                tvBuyDate.setText(listFood[position].buy_date)
                tvExpDate.setText(listFood[position].exp_date)
            }
            "medicine" -> {
                supportActionBar?.title = "Detail Medicine"
                listMed.addAll(MedicineData.listMedicine)

                tvTitleName.setText(listMed[position].name)
                imgItem.setImageResource(listMed[position].photo)
                tvCategory.setText("Medicine")
                tvName.setText(listMed[position].name)
                tvQty.setText((listMed[position].qty).toString())
                tvBuyDate.setText(listMed[position].buy_date)
                tvExpDate.setText(listMed[position].exp_date)
            }
            "skincare" -> {
                supportActionBar?.title = "Detail Skincare"
                listSkincare.addAll(SkincareData.listSkincare)

                tvTitleName.setText(listSkincare[position].name)
                imgItem.setImageResource(listSkincare[position].photo)
                tvCategory.setText("Skincare")
                tvName.setText(listSkincare[position].name)
                tvQty.setText((listSkincare[position].qty).toString())
                tvBuyDate.setText(listSkincare[position].buy_date)
                tvExpDate.setText(listSkincare[position].exp_date)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}