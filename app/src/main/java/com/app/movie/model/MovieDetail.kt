package com.app.movie.model

import java.io.Serializable

data class MovieDetail(val name : String, val genre : String, val rating : String, val htmlString: String): Serializable

    fun getMovieList() :HashMap<Genre, List<MovieDetail>> {
        val movieList : HashMap<Genre, List<MovieDetail>> = HashMap()
        val action = arrayListOf(
            MovieDetail("Eagle Eye","Action, Drama, Suspense","6.6/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("The Informer","Action, Suspense","6.6/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Message Man","Action, Suspense","6.0/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Mission: Impossible","Action, Adventure, Suspense","7.4/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Gladiator","Action, Drama","7.0/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            )
        )

        val comedy = arrayListOf(
            MovieDetail("Zombieland","Action, Adventure, Comedy, Horror, Science Fiction","6.7/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Jumanji: The Next Level","Action, Adventure, Comedy","6.6/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Crazy Rich Asians","Comedy","6.9/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Young Sheldon","Comedy","7.4/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Borat","Comedy","7.3/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            )
        )

        val crime = arrayListOf(
            MovieDetail("Jumanji: The Next Level","Action, Drama, Suspense","6.6/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("The Informer","Action, Suspense","6.6/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Message Man","Action, Suspense","6.0/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Mission: Impossible","Action, Adventure, Suspense","7.4/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Gladiator","Action, Drama","7.0/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            )
        )
        val drama = arrayListOf(
            MovieDetail("Eagle Eye","Action, Drama, Suspense","6.6/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("The Informer","Action, Suspense","6.6/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Message Man","Action, Suspense","6.0/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Mission: Impossible","Action, Adventure, Suspense","7.4/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Gladiator","Action, Drama","7.0/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            )
        )
        val fantasy = arrayListOf(
            MovieDetail("Eagle Eye","Action, Drama, Suspense","6.6/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("The Informer","Action, Suspense","6.6/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Message Man","Action, Suspense","6.0/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Mission: Impossible","Action, Adventure, Suspense","7.4/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Gladiator","Action, Drama","7.0/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            )
        )
        val scifi = arrayListOf(
            MovieDetail("Eagle Eye","Action, Drama, Suspense","6.6/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("The Informer","Action, Suspense","6.6/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Message Man","Action, Suspense","6.0/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Mission: Impossible","Action, Adventure, Suspense","7.4/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Gladiator","Action, Drama","7.0/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            )
        )
        val superHero = arrayListOf(
            MovieDetail("Eagle Eye","Action, Drama, Suspense","6.6/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("The Informer","Action, Suspense","6.6/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Message Man","Action, Suspense","6.0/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Mission: Impossible","Action, Adventure, Suspense","7.4/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            ),
            MovieDetail("Gladiator","Action, Drama","7.0/10",
                "<h2><b>Description</b></h2>\nThis is the movie i would recommend to watch\n<h2><b>Language</b></h2>\nEnglish\n<h2><b>Starring</b></h2>\nJohn Mendis, Tom Cruise\n<h2><b>Imdb Rating</b></h2>\n6.6/10"
            )
        )
        movieList[Genre.ACTION] = action
        movieList[Genre.COMEDY] = comedy
        movieList[Genre.CRIME] = crime
        movieList[Genre.DRAMA] = drama
        movieList[Genre.FANTASY] = fantasy
        movieList[Genre.SCIFI] = scifi
        movieList[Genre.SUPER_HERO] = superHero

        return movieList
    }