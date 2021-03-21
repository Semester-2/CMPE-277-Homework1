package com.app.movie.adapter

import android.content.Intent
import android.opengl.Visibility
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.app.movie.MovieDetailScrollingActivity
import com.app.movie.R
import com.app.movie.model.MovieDetail
import java.io.Serializable

class RecommendationGridAdapter (private val movieList : List<MovieDetail>) :
    RecyclerView.Adapter<RecommendationGridAdapter.CardHolder>(){

    class CardHolder(private val view: View): RecyclerView.ViewHolder(view){
        private val imageView : ImageView = view.findViewById(R.id.image)
        val name : TextView = view.findViewById(R.id.name)
        private val rating : TextView = view.findViewById(R.id.rating)
        private val card : CardView = view.findViewById(R.id.card)
        private val heartImage : ImageView = view.findViewById(R.id.heartImage)

        fun bind(oneItem: MovieDetail) {
            heartImage.visibility = View.GONE
            name.text = oneItem.name
            rating.text = oneItem.rating
            imageView.setImageResource(R.drawable.test_wide)
            if(oneItem.isEnabled){
                heartImage.setImageResource(R.drawable.heart_red)
            }else{
                heartImage.setImageResource(R.drawable.heart_black)
            }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): CardHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.movie_list_item, viewGroup, false)

        return CardHolder(view)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: CardHolder, position: Int) {
        holder.bind(movieList[position])
    }
}