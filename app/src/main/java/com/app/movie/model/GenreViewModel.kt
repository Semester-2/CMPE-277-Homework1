package com.app.movie.model

import android.util.Log
import androidx.lifecycle.ViewModel

class GenreViewModel : ViewModel() {

    var selectedGenre : Genre
    private var movieDetailList : ArrayList<MovieDetail>

    init {
        selectedGenre = Genre.ACTION
        movieDetailList = getList()[selectedGenre] as ArrayList<MovieDetail>
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("TitleViewModel","TitleViewModel destroyed!")
    }

    fun updateGenre(genre : Genre) {
        selectedGenre = genre
    }

    fun getMovieList(it: Genre): List<MovieDetail>? {
        movieDetailList = getList()[selectedGenre] as ArrayList<MovieDetail>
        return movieDetailList
    }

    fun updateMovieList(position : Int){
        movieDetailList = getList()[selectedGenre] as ArrayList<MovieDetail>
        val enabled = movieDetailList[position]?.isEnabled
        movieDetailList[position].isEnabled = !enabled
    }
}