package com.example.anew

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(
    private val context: Context,
    private val pera: List<Pera>,
    val listener: (Pera) -> Unit
):RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title = view.findViewById<TextView>(R.id._title)
        fun bindView(pera:Pera, listener: (Pera) -> Unit) {
            title.text = pera.pera_title.toString()
            itemView.setOnClickListener{listener(pera)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list, parent, false))


    override fun getItemCount(): Int = pera.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(pera[position],listener)
    }
}