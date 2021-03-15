package com.app.movie.`interface`

import com.app.movie.model.MovieDetail

interface MovieSelectListener {

    fun handleMovieSelect(movieSelected : MovieDetail)
}