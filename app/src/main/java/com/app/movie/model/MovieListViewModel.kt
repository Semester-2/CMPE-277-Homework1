package com.app.movie.model

import android.util.Log
import androidx.lifecycle.ViewModel

class MovieListViewModel : ViewModel() {

    var selectedGenre : Genre

    init {
        selectedGenre = Genre.COMEDY
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("TitleViewModel","TitleViewModel destroyed!")
    }

    fun updateGenre(genre : Genre) {
        selectedGenre = genre
    }
}