package com.app.movie.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.app.movie.MovieDetailActivity
import com.app.movie.MovieDetailScrollingActivity
import com.app.movie.R
import com.app.movie.model.MovieDetail
import java.io.Serializable

const val SELECTED_MOVIE = "Selected Movie"
class DetailCardAdapter (private val movieList : MutableList<MovieDetail>) :
    RecyclerView.Adapter<DetailCardAdapter.CardHolder>(){

    class CardHolder(private val view: View): RecyclerView.ViewHolder(view){
        private val imageView : ImageView = view.findViewById(R.id.image)
        val name : TextView = view.findViewById(R.id.name)
        private val rating : TextView = view.findViewById(R.id.rating)
        private val card : CardView = view.findViewById(R.id.cardView)

        fun bind(oneItem: MovieDetail) {
            name.text = oneItem.name
            rating.text = oneItem.rating
            imageView.setImageResource(R.drawable.comedy)//R.drawable.imageupload)

            val context = view.context
            card.setOnClickListener {

                val intent = Intent(context, MovieDetailScrollingActivity::class.java).apply {
                    putExtra(SELECTED_MOVIE, oneItem as Serializable)
                }
                context.startActivity(intent)
            }
        }
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
        holder.bind(movieList[position])
    }
}