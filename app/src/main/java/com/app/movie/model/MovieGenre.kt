package com.app.movie.model

import com.app.movie.R
import java.io.Serializable

data class MovieGenre(val genre : Genre, val resId : Int)

public val movieGenreList = listOf<MovieGenre>(
    MovieGenre(Genre.ACTION, R.drawable.action),
    MovieGenre(Genre.COMEDY, R.drawable.comedy),
    MovieGenre(Genre.HORROR, R.drawable.crime),
    MovieGenre(Genre.ROMANCE, R.drawable.drama),
    MovieGenre(Genre.FANTASY, R.drawable.fantasy),
    MovieGenre(Genre.SCIFI, R.drawable.scifi),
    MovieGenre(Genre.SUPER_HERO, R.drawable.super_hero)

)