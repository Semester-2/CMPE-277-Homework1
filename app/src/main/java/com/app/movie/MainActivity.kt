package com.app.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.app.movie.`interface`.GenreSelectListener
import com.app.movie.adapter.MovieGridAdapter
import com.app.movie.model.Genre
import com.app.movie.model.MovieGenre
import kotlinx.android.synthetic.main.dashboard.*

class MainActivity : AppCompatActivity() , GenreSelectListener{

    private val genreList: ArrayList<MovieGenre> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)
        addGenres()
        genre_recycler_view.adapter = MovieGridAdapter(genreList, this, this)
        val gridLayoutManager = GridLayoutManager(this,2)
        genre_recycler_view.layoutManager=gridLayoutManager
        genre_recycler_view.hasFixedSize()
    }

    private fun addGenres() {

        genreList.add(MovieGenre(Genre.ACTION, R.drawable.action))
        genreList.add(MovieGenre(Genre.COMEDY, R.drawable.comedy))
        genreList.add(MovieGenre(Genre.CRIME, R.drawable.crime))
        genreList.add(MovieGenre(Genre.DRAMA, R.drawable.drama))
        genreList.add(MovieGenre(Genre.FANTASY, R.drawable.fantasy))
        genreList.add(MovieGenre(Genre.SCIFI, R.drawable.scifi))
        genreList.add(MovieGenre(Genre.SUPER_HERO, R.drawable.super_hero))
    }


    override fun handleGenreSelect(data: MovieGenre) {
        Toast.makeText(this,"Click handled",Toast.LENGTH_LONG).show()
    }
}