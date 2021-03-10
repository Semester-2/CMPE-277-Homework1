package com.app.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.movie.adapter.MovieGridAdapter
import kotlinx.android.synthetic.main.dashboard.*

class MainActivity : AppCompatActivity() {

    val genreList: ArrayList<kotlin.Int> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)
        addGenres()
        genre_recycler_view.adapter = MovieGridAdapter(genreList,this)
        val gridLayoutManager = GridLayoutManager(this,2)
        genre_recycler_view.layoutManager=gridLayoutManager
        genre_recycler_view.hasFixedSize()
    }

    fun addGenres() {
        genreList.add(R.drawable.action)
        genreList.add(R.drawable.comedy)
        genreList.add(R.drawable.crime)
        genreList.add(R.drawable.drama)
        genreList.add(R.drawable.fantasy)
        genreList.add(R.drawable.scifi)
        genreList.add(R.drawable.super_hero)
    }
}