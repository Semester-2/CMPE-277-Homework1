package com.app.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.app.movie.adapter.MovieGridAdapter
import com.app.movie.model.movieGenreList
import kotlinx.android.synthetic.main.genre_grid_layout.*

const val SELECTED_GENRE = "Selected_Genre"

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.genre_grid_layout)

        genre_recycler_view.adapter = MovieGridAdapter(movieGenreList)
        val gridLayoutManager = GridLayoutManager(this,2)
        genre_recycler_view.layoutManager=gridLayoutManager
        genre_recycler_view.hasFixedSize()
    }
}

