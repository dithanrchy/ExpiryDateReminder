package com.example.expirydatereminder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.expirydatereminder.adapter.FoodAdapter
import com.example.expirydatereminder.adapter.MedicalAdapter
import com.example.expirydatereminder.adapter.SkincareAdapter
import com.example.expirydatereminder.data.*
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class ListActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_STATUS = "extra_status"
    }

    private lateinit var rvList: RecyclerView
    private var list1: ArrayList<Food> = arrayListOf()
    private var list2: ArrayList<Med> = arrayListOf()
    private var list3: ArrayList<Skincare> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        supportActionBar?.elevation = 0f
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        rvList = findViewById(R.id.rv_list)
        rvList.setHasFixedSize(true)

        val status = intent.getIntExtra(EXTRA_STATUS, 0)
        var title:TextView = findViewById(R.id.list_title)

        list1.addAll(FoodData.listFood)
        list2.addAll(MedicineData.listMedicine)
        list3.addAll(SkincareData.listSkincare)
        when(status){
            1 -> {
                title.setText("Food")
                supportActionBar?.title = "List Food"
                showFoodList()
            }
            2 -> {
                title.setText("Medicine")
                supportActionBar?.title = "List Medicine"
                showMedList()
            }
            3 -> {
                title.setText("Skincare")
                supportActionBar?.title = "List Skincare"
                showSkincareList()
            }
        }

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Add Item Coming Soon", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

    }

    private fun showFoodList() {
        rvList.layoutManager = LinearLayoutManager (this)
        val listAdapter = FoodAdapter(list1)
        rvList.adapter = listAdapter
    }

    private fun showMedList() {
        rvList.layoutManager = LinearLayoutManager (this)
        val listAdapter2 = MedicalAdapter(list2)
        rvList.adapter = listAdapter2
    }

    private fun showSkincareList() {
        rvList.layoutManager = LinearLayoutManager (this)
        val listAdapter3 = SkincareAdapter(list3)
        rvList.adapter = listAdapter3
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}