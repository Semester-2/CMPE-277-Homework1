package com.app.movie

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.movie.`interface`.MovieSelectListener
import com.app.movie.adapter.DetailCardAdapter
import com.app.movie.model.Genre
import com.app.movie.model.MovieDetail
import kotlinx.android.synthetic.main.movie_list.*

class MovieListActivity : AppCompatActivity(), MovieSelectListener{
    var  movieList: HashMap<Genre,List<MovieDetail>> = HashMap()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movie_list)
        addMovies()
        //selectedGenre : Genre = intent.getStringExtra(SELECTED_GENRE)
       // val list = movieList.get(intent.getStringExtra(SELECTED_GENRE))
        //genre_recycler_view.adapter = list?.let { DetailCardAdapter(it, this ) }

        movie_list_view.adapter = movieList[Genre.ACTION]?.let { DetailCardAdapter(it, this,this ) }
        val linearLayoutManager = LinearLayoutManager(this)
        movie_list_view.layoutManager=linearLayoutManager
        movie_list_view.hasFixedSize()

    }

    private fun addMovies() {
        //val list: ArrayList<MovieList> = ArrayList()
        val action = arrayListOf(
            MovieDetail("Eagle Eye","Action, Drama, Suspense","6.6/10"),
            MovieDetail("The Informer","Action, Suspense","6.6/10"),
            MovieDetail("Message Man","Action, Suspense","6.0/10"),
            MovieDetail("Mission: Impossible","Action, Adventure, Suspense","7.4/10"),
            MovieDetail("Gladiator","Action, Drama","7.0/10")
        )

        val comedy = arrayListOf(
            MovieDetail("Zombieland","Action, Adventure, Comedy, Horror, Science Fiction","6.7/10"),
            MovieDetail("Jumanji: The Next Level","Action, Adventure, Comedy","6.6/10"),
            MovieDetail("Crazy Rich Asians","Comedy","6.9/10"),
            MovieDetail("Young Sheldon","Comedy","7.4/10"),
            MovieDetail("Borat","Comedy","7.3/10")
        )

        val crime = arrayListOf(
            MovieDetail("Jumanji: The Next Level","Action, Drama, Suspense","6.6/10"),
            MovieDetail("The Informer","Action, Suspense","6.6/10"),
            MovieDetail("Message Man","Action, Suspense","6.0/10"),
            MovieDetail("Mission: Impossible","Action, Adventure, Suspense","7.4/10"),
            MovieDetail("Gladiator","Action, Drama","7.0/10")
        )
        val drama = arrayListOf(
            MovieDetail("Eagle Eye","Action, Drama, Suspense","6.6/10"),
            MovieDetail("The Informer","Action, Suspense","6.6/10"),
            MovieDetail("Message Man","Action, Suspense","6.0/10"),
            MovieDetail("Mission: Impossible","Action, Adventure, Suspense","7.4/10"),
            MovieDetail("Gladiator","Action, Drama","7.0/10")
        )
        val fantasy = arrayListOf(
            MovieDetail("Eagle Eye","Action, Drama, Suspense","6.6/10"),
            MovieDetail("The Informer","Action, Suspense","6.6/10"),
            MovieDetail("Message Man","Action, Suspense","6.0/10"),
            MovieDetail("Mission: Impossible","Action, Adventure, Suspense","7.4/10"),
            MovieDetail("Gladiator","Action, Drama","7.0/10")
        )
        val scifi = arrayListOf(
            MovieDetail("Eagle Eye","Action, Drama, Suspense","6.6/10"),
            MovieDetail("The Informer","Action, Suspense","6.6/10"),
            MovieDetail("Message Man","Action, Suspense","6.0/10"),
            MovieDetail("Mission: Impossible","Action, Adventure, Suspense","7.4/10"),
            MovieDetail("Gladiator","Action, Drama","7.0/10")
        )
        val superHero = arrayListOf(
            MovieDetail("Eagle Eye","Action, Drama, Suspense","6.6/10"),
            MovieDetail("The Informer","Action, Suspense","6.6/10"),
            MovieDetail("Message Man","Action, Suspense","6.0/10"),
            MovieDetail("Mission: Impossible","Action, Adventure, Suspense","7.4/10"),
            MovieDetail("Gladiator","Action, Drama","7.0/10")
        )
        movieList[Genre.ACTION] = action
        movieList[Genre.COMEDY] = comedy
    }

    override fun handleMovieSelect(movieSelected: MovieDetail) {
        val intent = Intent(this, MovieDetailActivity::class.java)
        startActivity(intent)
    }
}