package com.app.movie.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.app.movie.R

class MovieGridAdapter(val genreList : ArrayList<kotlin.Int>,  val context:Context) : RecyclerView.Adapter<MovieGridAdapter.MovieHolder>() {

    class MovieHolder(view: View): RecyclerView.ViewHolder(view),View.OnClickListener{
        val imageView : ImageView = view.findViewById(R.id.list_image_view)

        init{
            imageView.setOnClickListener(this)
        }

        override fun onClick(view: View?) {

        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MovieHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.movie_grid_list_item, viewGroup, false)

        return MovieHolder(view)
    }

    override fun getItemCount(): Int {
        return genreList.size
    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {
//        holder.imageView.setImageDrawable(
//            ContextCompat.getDrawable(
//                context, // Context
//                R.drawable.action // Drawable
//            )
//        )
        holder.imageView.setImageResource(genreList[position])
    }
}