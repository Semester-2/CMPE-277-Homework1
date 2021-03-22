package com.app.movie

import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.app.movie.adapter.RecommendationGridAdapter
import com.app.movie.adapter.SELECTED_MOVIE
import com.app.movie.adapter.SELECTED_POSITION
import com.app.movie.model.GenreViewModel
import com.app.movie.model.MovieDetail
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_movie_detail_scrolling.*
import kotlinx.android.synthetic.main.content_scrolling.*

class MovieDetailScrollingActivity : AppCompatActivity() {
    private lateinit var viewModel: GenreViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail_scrolling)

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        val dataItem: MovieDetail? = intent.extras?.get(SELECTED_MOVIE) as? MovieDetail
        val position: Int? = intent.extras?.get(SELECTED_POSITION) as? Int
        val toolbarLayout: CollapsingToolbarLayout = findViewById<CollapsingToolbarLayout>(R.id.toolbar_layout)

        viewModel = ViewModelProviders.of(this).get(GenreViewModel::class.java)
        if (dataItem != null) {

            toolbarLayout.title = dataItem.name
            collapsingtoolbarheadertext.text = dataItem.name
            toolbarLayout.setBackgroundResource(dataItem.imageDetail)
            desc.text = dataItem.desc
            directorName.text = dataItem.director
            starringName.text = dataItem.starring
            if(dataItem.isEnabled)
                fab.setImageResource(R.drawable.heart)
            else fab.setImageResource(R.drawable.heart_border)
        }

        fab.setOnClickListener {
            if (dataItem != null) {
                if(dataItem.isEnabled){
                    fab.setImageResource(R.drawable.heart_border)
                }else{
                    fab.setImageResource(R.drawable.heart)
                }
                dataItem.isEnabled = !dataItem.isEnabled
                if (position != null) {
                    viewModel.updateMovieList(position)
                    //updateList(viewModel.selectedGenre,position)
                }
            }
        }

        //recomended list view implementation
        recommendedListView.adapter = viewModel.getMovieList(viewModel.selectedGenre)?.let {
            RecommendationGridAdapter(
                it
            )
        }
        val gridLayoutManager = GridLayoutManager(this,2)
        recommendedListView.layoutManager=gridLayoutManager
        recommendedListView.hasFixedSize()

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}