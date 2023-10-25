package com.example.prakt23

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.wear.compose.material.VignettePosition
import com.bumptech.glide.Glide

abstract class StateRecycler (val context:Context, val quotes: quotes):RecyclerView.Adapter<StateRecycler.MyVH>(){
class MyVH(val itemView: View):RecyclerView.ViewHolder(itemView)
{
   // val imageView: ImageView = itemView.findViewById()
    // val title: TextView = itemView.findViewById()
    // val text_state:TextView = itemView.findViewById(R.id)

}

   /* override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StateRecycler.MyVH {
        {
         // val root = LayoutInflater.from(context).inflate(R.layout.state_adapter,parent,false)
            //return MyVH(root)
        }
    }*/

  /*  override fun onBindViewHolder(holder:StateRecycler.MyVH,position: Int)
    {
        Glide.with(context).load(quotes.data[position].image).into(holder.imageView)
        holder.title.setText(quotes.data[position].title)
        holder.text_state.setText(quotes.data[position].description)
    }*/

    override fun getItemCount():Int
    {
        return quotes.data.size
    }
}