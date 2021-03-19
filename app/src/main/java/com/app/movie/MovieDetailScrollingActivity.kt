package com.app.movie

import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.HtmlCompat
import com.app.movie.adapter.SELECTED_MOVIE
import com.app.movie.model.MovieDetail
import kotlinx.android.synthetic.main.activity_movie_detail_scrolling.*
import kotlinx.android.synthetic.main.content_scrolling.*

class MovieDetailScrollingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail_scrolling)

        val dataItem: MovieDetail? = intent.extras?.get(SELECTED_MOVIE) as? MovieDetail
        val toolbarLayout: CollapsingToolbarLayout = findViewById<CollapsingToolbarLayout>(R.id.toolbar_layout)

        if (dataItem != null) {

            toolbarLayout.title = "Movie Details"
            collapsingtoolbarheadertext.text = dataItem.name
            toolbarLayout.setBackgroundResource(R.drawable.comedy)

            descHeader.text = HtmlCompat.fromHtml(dataItem.htmlString, 0)

        }

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}