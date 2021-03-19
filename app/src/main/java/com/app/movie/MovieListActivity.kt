package com.app.movie

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.movie.adapter.DetailCardAdapter
import com.app.movie.model.Genre
import com.app.movie.model.MovieDetail
import com.app.movie.model.MovieListViewModel
import com.app.movie.model.getMovieList
import kotlinx.android.synthetic.main.movie_list.*
import java.lang.reflect.Array.get

class MovieListActivity : AppCompatActivity(){

    private lateinit var viewModel: MovieListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movie_list)

        viewModel = ViewModelProviders.of(this).get(MovieListViewModel::class.java)
        val genre: Genre? = intent.extras?.get(SELECTED_GENRE) as? Genre
        var  movieList = getMovieList()
        if (genre != null) {
            viewModel.updateGenre(genre)
        }
        val movie : MutableList<MovieDetail>? = movieList[viewModel.selectedGenre]?.toMutableList()

        movie_list_view.adapter = movie?.let { DetailCardAdapter(it) }
        val linearLayoutManager = LinearLayoutManager(this)
        movie_list_view.layoutManager=linearLayoutManager
    }
}