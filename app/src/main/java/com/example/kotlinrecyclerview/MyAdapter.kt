package com.example.kotlinrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val newsList :ArrayList<News> ) :
    RecyclerView.Adapter<MyAdapter.MyviewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {

        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyviewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {

        val currentItem=newsList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeading.text=currentItem.heading

    }

    override fun getItemCount(): Int {
return newsList.size   }



    class MyviewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val titleImage: ShapeableImageView =itemView.findViewById(R.id.title_image)
        val tvHeading :TextView=itemView.findViewById(R.id.text)


    }

}