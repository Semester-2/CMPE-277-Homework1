package com.app.movie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.movie.adapter.DetailCardAdapter
import com.app.movie.model.Genre
import com.app.movie.model.GenreViewModel
import kotlinx.android.synthetic.main.movie_list.*

const val GENRE = "Shared Pref genre"

class MovieListActivity : AppCompatActivity(){

    private lateinit var viewModel: GenreViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movie_list)
        viewModel = ViewModelProviders.of(this).get(GenreViewModel::class.java)

        val genre: Genre? = intent.extras?.get(SELECTED_GENRE) as? Genre
        if (genre != null) {
            viewModel.updateGenre(genre)
        }



        var  movieList = viewModel.selectedGenre?.let { viewModel.getMovieList(it) }

        movie_list_view.adapter = movieList?.let { DetailCardAdapter(it) }
        val linearLayoutManager = LinearLayoutManager(this)
        movie_list_view.layoutManager=linearLayoutManager


    }
}