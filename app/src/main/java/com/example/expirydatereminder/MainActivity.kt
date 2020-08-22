package com.example.expirydatereminder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.elevation = 0f

        val cvList: CardView = findViewById(R.id.cv_list)
        val cvProfile: CardView = findViewById(R.id.cv_profile)
        val cvFaq: CardView = findViewById(R.id.cv_faq)
        val cvSettings: CardView = findViewById(R.id.cv_setting)

        cvList.setOnClickListener(this)
        cvProfile.setOnClickListener(this)
        cvFaq.setOnClickListener(this)
        cvSettings.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.cv_list -> {
                val categoriesIntent = Intent(this@MainActivity, CategoriesActivity::class.java)
                startActivity(categoriesIntent)
            }
            R.id.cv_profile -> {
                val profileIntent = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(profileIntent)
            }
            R.id.cv_faq -> {
                val faqIntent = Intent(this@MainActivity, FaqActivity::class.java)
                startActivity(faqIntent)
            }
            R.id.cv_setting -> {

            }
        }
    }
}