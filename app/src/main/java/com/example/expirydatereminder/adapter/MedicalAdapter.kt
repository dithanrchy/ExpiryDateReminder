package com.example.expirydatereminder.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.expirydatereminder.DetailActivity
import com.example.expirydatereminder.R
import com.example.expirydatereminder.data.Med


class MedicalAdapter(private val listData: ArrayList<Med>) : RecyclerView.Adapter<MedicalAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tv_name)
        val tvExpDate: TextView = itemView.findViewById(R.id.tv_exp_date)
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val btnDetail: Button = itemView.findViewById(R.id.btn_detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.rv_list, parent,false)
        return ListViewHolder(
            view
        )
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = listData[position]
        Glide.with(holder.itemView.context)
            .load(listData[position].photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)
        holder.tvName.text = data.name
        holder.tvExpDate.text = data.exp_date

        holder.btnDetail.setOnClickListener {
            val context = it.context
            val detailIntent = Intent(context, DetailActivity::class.java)
            detailIntent.putExtra(DetailActivity.EXTRA_CATEGORY, "medicine")
            detailIntent.putExtra(DetailActivity.EXTRA_POSITION, position)
            context.startActivity(detailIntent)
        }
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}