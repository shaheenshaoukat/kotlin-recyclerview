package com.example.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {



    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList :ArrayList<News>
    lateinit var imageId :Array<Int>
    lateinit var heading :Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId= arrayOf(
            R.drawable.one,
            R.drawable.one,
            R.drawable.one,
            R.drawable.one,
            R.drawable.one,
            R.drawable.one,
            R.drawable.one,
            R.drawable.one,
            R.drawable.one,
            R.drawable.one,
            R.drawable.one,
            R.drawable.one,
            R.drawable.one,
            R.drawable.one,
            R.drawable.one,





        )

        heading= arrayOf(

            "Nature",
            "Nature",
            "Nature",
            "Nature",
            "Nature",
            "Nature",
            "Nature",
            "Nature",
            "Nature",
            "Nature",
            "Nature",
            "Nature",
            "Nature",
            "Nature",
            "Nature",

        )
        newRecyclerView=findViewById(R.id.recyclerview)
        newRecyclerView.layoutManager=LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        newArrayList= arrayListOf<News>()

        getUserData()

    }
    private fun getUserData(){

        for (i in imageId.indices){
            val news=News(imageId[i], heading[i])
            newArrayList.add(news)
        }
        newRecyclerView.adapter=MyAdapter(newArrayList)
    }
}