package com.app.movie.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.app.movie.MovieListActivity
import com.app.movie.R
import com.app.movie.SELECTED_GENRE
import com.app.movie.model.MovieGenre

class MovieGridAdapter(private val genreList : List<MovieGenre>) :
    RecyclerView.Adapter<MovieGridAdapter.MovieHolder>(){

    class MovieHolder(private val view: View): RecyclerView.ViewHolder(view){
        private val imageView : ImageView = view.findViewById(R.id.list_image_view)
        fun bind(oneItem: MovieGenre) {
            imageView.setImageResource(oneItem.resId)

            val context = view.context
            view.setOnClickListener {

                val intent = Intent(context, MovieListActivity::class.java).apply {
                    putExtra(SELECTED_GENRE, oneItem.genre)
                }
                context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MovieHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.genre_grid_item, viewGroup, false)

        return MovieHolder(view)
    }

    override fun getItemCount(): Int {
        return genreList.size
    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {
       holder.bind(genreList[position])
    }
}