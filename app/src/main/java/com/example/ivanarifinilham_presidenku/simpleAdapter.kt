package com.example.ivanarifinilham_presidenku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class simpleAdapter (private val dataSet:ArrayList<Datagambar>) :
    RecyclerView.Adapter<simpleAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var data: ImageView = view.findViewById(R.id.tempatGambar)
        var judul: TextView = view.findViewById(R.id.tempatTeks)
        var tahun: TextView = view.findViewById(R.id.tempattahun)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_simple_adapter, parent, false)
        return ViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val DataGambar = dataSet[position]
        holder.data.setImageResource(DataGambar.gambar)
        holder.judul.text = DataGambar.title
        holder.tahun.text = DataGambar.tahun
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}