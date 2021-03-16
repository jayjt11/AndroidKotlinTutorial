package com.expleo.androidkotlintutorial.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.expleo.androidkotlintutorial.R
import com.expleo.androidkotlintutorial.model.Whatsapp

class WhatsappAdapter(var listItems : ArrayList<Whatsapp>) : RecyclerView.Adapter<WhatsappAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var txtTitle = view.findViewById<TextView>(R.id.txtTitle)
        var txtDesc = view.findViewById<TextView>(R.id.txtDesc)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.layout_whatsapp_cell_list, parent, false)

        return MyViewHolder(layoutInflater)
    }

    override fun getItemCount(): Int {

        return listItems.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        var whatsapp : Whatsapp = listItems[position]
        holder.txtTitle.text = whatsapp.title
        holder.txtDesc.text = whatsapp.desc
    }

}