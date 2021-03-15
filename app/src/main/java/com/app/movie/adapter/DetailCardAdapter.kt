package com.app.movie.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.app.movie.R
import com.app.movie.`interface`.MovieSelectListener
import com.app.movie.model.MovieDetail

class DetailCardAdapter (private val movieList : List<MovieDetail>, val listener: MovieSelectListener, val context: Context) :
    RecyclerView.Adapter<DetailCardAdapter.CardHolder>(){

    class CardHolder(view: View): RecyclerView.ViewHolder(view){
        val imageView : ImageView = view.findViewById(R.id.image)
        val name : TextView = view.findViewById(R.id.name)
       // val genre : TextView = view.findViewById(R.id.genre_list)
        val rating : TextView = view.findViewById(R.id.rating)
        val card : CardView = view.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): CardHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_view_item, viewGroup, false)

        return CardHolder(view)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: CardHolder, position: Int) {
        val list = movieList[position]
       holder.imageView.setImageResource(R.drawable.action)
        holder.name.text = list.name
       // holder.genre.text = list.genre
        holder.rating.text = list.rating
        holder.card.setOnClickListener{
            listener.handleMovieSelect(movieList[position])
        }
        //holder.imageView.setImageResource(movieList[position].resId)
//        holder.imageView.setOnClickListener {
//            clickListener.handleGenreSelect(genreList[position])
//        }
    }

}