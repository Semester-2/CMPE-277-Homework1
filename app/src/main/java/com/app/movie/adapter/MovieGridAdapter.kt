package com.app.movie.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.app.movie.R
import com.app.movie.`interface`.GenreSelectListener
import com.app.movie.model.MovieGenre

class MovieGridAdapter(private val genreList : ArrayList<MovieGenre>, private val clickListener: GenreSelectListener, val context:Context) :
    RecyclerView.Adapter<MovieGridAdapter.MovieHolder>(){

    class MovieHolder(view: View): RecyclerView.ViewHolder(view){
        val imageView : ImageView = view.findViewById(R.id.list_image_view)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MovieHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.genre_list_item, viewGroup, false)

        return MovieHolder(view)
    }

    override fun getItemCount(): Int {
        return genreList.size
    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {
        holder.imageView.setImageResource(genreList[position].resId)
        holder.imageView.setOnClickListener {
            clickListener.handleGenreSelect(genreList[position])
        }
    }
}