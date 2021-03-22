package com.app.movie.model

import com.app.movie.R
import java.io.Serializable

data class MovieDetail(val name : String, val genre : String, val desc : String, val director: String, val starring: String , val image: Int, val imageDetail : Int,
                       val rating: String, val dateTime: String , var isEnabled: Boolean): Serializable

fun getList() :HashMap<Genre, List<MovieDetail>> {
    val movieList : HashMap<Genre, List<MovieDetail>> = HashMap()
    val action = arrayListOf(
        MovieDetail("Back to the Future","Comedy","Marty McFly, a 17-year-old high school student, is accidentally sent thirty years into the past in a time-traveling DeLorean invented by his close friend, the eccentric scientist Doc Brown.",
            "Robert Zemeckis","Michael J. Fox, Christopher Lloyd, Lea Thompson",R.drawable.btf,R.drawable.btf_detail,"8.6","1985 1h 56m", true),
        MovieDetail("Guardians Of Galaxy","Comedy","A group of intergalactic criminals must pull together to stop a fanatical warrior with plans to purge the universe.",
            "James Gunn","Chris Pratt, Vin Diesel, Bradley Cooper ",R.drawable.gofg,R.drawable.gofg_detail,"8.0","2014 2h 1m", false),
        MovieDetail("Finding Nemo","Comedy","After his son is captured in the Great Barrier Reef and taken to Sydney, a timid clownfish sets out on a journey to bring him home.",
            " Andrew Stanton","",R.drawable.nemo, R.drawable.nemo_detail,"8.1","2003 1h 40m", false),
                MovieDetail("The Avengers","Comedy","Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity.",
        "Joss Whedon","Matthew McConaughey, Anne Hathaway, Jessica Chastain",R.drawable.avengers,R.drawable.avengers_detail,"8.0","2012 2h 23m", true),
    MovieDetail("Star Wars","Comedy","Luke Skywalker joins forces with a Jedi Knight, a cocky pilot, a Wookiee and two droids to save the galaxy from the Empire's world-destroying battle station, while also attempting to rescue Princess Leia from the mysterious Darth Vader.",
        "George Lucas","Mark Hamill, Harrison Ford, Carrie Fisher",R.drawable.interstellar,R.drawable.interstellar_detail,"8.6","1977 2h 1m", false)
    )

    val horror = arrayListOf(
        MovieDetail("Get Out","Horror","A young African-American visits his white girlfriend's parents for the weekend, where his simmering uneasiness about their reception of him eventually reaches a boiling point.",
            "Jordan Peele","Daniel Kaluuya, Allison Williams, Bradley Whitford ",R.drawable.getout,R.drawable.getout_detail,"8.2","2017 1h 44m", true),
                MovieDetail("Walking Dead","Horror","Sheriff Deputy Rick Grimes wakes up from a coma to learn the world is in ruins and must lead a group of survivors to stay alive.",
        "Frank Darabont, Angela Kang"," Andrew Lincoln, Norman Reedus, Melissa McBride",R.drawable.twd,R.drawable.twd_detail,"8.2","2006 2h 1m", true),
    MovieDetail("The Shinning","Horror","Sheriff Deputy Rick Grimes wakes up from a coma to learn the world is in ruins and must lead a group of survivors to stay alive.",
        "Frank Darabont, Angela Kang"," Andrew Lincoln, Norman Reedus, Melissa McBride",R.drawable.shining,R.drawable.shining_detail,"8.4","1980 2h 26m", false),
    MovieDetail("Inception","Horror","A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.",
        "Christopher Nolan"," Leonardo DiCaprio, Joseph Gordon-Levitt, Elliot Page",R.drawable.inception,R.drawable.inception_detail,"8.0","2010 2h 28m", false),
                MovieDetail("Interstellar","Horror","A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
        "Christopher Nolan","Matthew McConaughey, Anne Hathaway, Jessica Chastain",R.drawable.interstellar,R.drawable.interstellar_detail,"8.6","2014 2h 49m", false)
    )
    val romance = arrayListOf(
        MovieDetail("Titanic","Romance","A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.",
            "James Cameron","Leonardo DiCaprio, Kate Winslet, Billy Zane",R.drawable.titanic,R.drawable.titanic_detail,"8.1","1997 3h 14m", false),
        MovieDetail("Wall E","Romance","In the distant future, a small waste-collecting robot inadvertently embarks on a space journey that will ultimately decide the fate of mankind.",
            " Andrew Stanton","Ben Burtt, Elissa Knight, Jeff Garlin",R.drawable.walle,R.drawable.walle_detail,"8.4","2008 1h 38m", false),
        MovieDetail("The Shinning","Romance","Sheriff Deputy Rick Grimes wakes up from a coma to learn the world is in ruins and must lead a group of survivors to stay alive.",
            "Frank Darabont, Angela Kang"," Andrew Lincoln, Norman Reedus, Melissa McBride",R.drawable.shining,R.drawable.shining_detail,"8.4","1980 2h 26m", false),
                MovieDetail("The Matrix","Romance","When a beautiful stranger leads computer hacker Neo to a forbidding underworld, he discovers the shocking truth--the life he knows is the elaborate deception of an evil cyber-intelligence.",
        "Lana Wachowski","Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss",R.drawable.matrix,R.drawable.matrix_detail,"8.7","1999 2h 16m", true),
    MovieDetail("Back to the Future","Romance","Marty McFly, a 17-year-old high school student, is accidentally sent thirty years into the past in a time-traveling DeLorean invented by his close friend, the eccentric scientist Doc Brown.",
        "Robert Zemeckis","Michael J. Fox, Christopher Lloyd, Lea Thompson",R.drawable.btf,R.drawable.btf_detail,"8.6","1985 1h 56m", false),
    MovieDetail("Wall E","Romance","In the distant future, a small waste-collecting robot inadvertently embarks on a space journey that will ultimately decide the fate of mankind.",
        " Andrew Stanton","Ben Burtt, Elissa Knight, Jeff Garlin",R.drawable.walle,R.drawable.walle_detail,"8.4","2008 1h 38m", false)
    )
    val scifi = arrayListOf(
        MovieDetail("Inception","Sci-Fi","A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.",
            "Christopher Nolan"," Leonardo DiCaprio, Joseph Gordon-Levitt, Elliot Page",R.drawable.inception,R.drawable.inception_detail,"8.8","2010 2h 28m", true),
                    MovieDetail("The Matrix","Sci-Fi","When a beautiful stranger leads computer hacker Neo to a forbidding underworld, he discovers the shocking truth--the life he knows is the elaborate deception of an evil cyber-intelligence.",
            "Lana Wachowski","Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss",R.drawable.matrix,R.drawable.matrix_detail,"8.7","1999 2h 16m", false),
        MovieDetail("Interstellar","Sci-Fi","A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
            "Christopher Nolan","Matthew McConaughey, Anne Hathaway, Jessica Chastain",R.drawable.interstellar,R.drawable.interstellar_detail,"8.6","2014 2h 49m", false),
        MovieDetail("The Avengers","Sci-Fi","Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity.",
            "Joss Whedon","",R.drawable.avengers,R.drawable.avengers_detail,"8.0","2012 2h 23m", false),
        MovieDetail("Star Wars","Sci-Fi","Luke Skywalker joins forces with a Jedi Knight, a cocky pilot, a Wookiee and two droids to save the galaxy from the Empire's world-destroying battle station, while also attempting to rescue Princess Leia from the mysterious Darth Vader.",
            "George Lucas","Mark Hamill, Harrison Ford, Carrie Fisher",R.drawable.interstellar,R.drawable.interstellar_detail,"8.6","1977 2h 1m", false)

    )
    val superHero = arrayListOf(
        MovieDetail("The Dark Knight","Superhero","When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.",
            "Christopher Nolan","Christian Bale, Heath Ledger, Aaron Eckhart ",R.drawable.batman,R.drawable.batman_detail,"9.0","2008 2h 32m", false),
        MovieDetail("Ironman","Superhero","After being held captive in an Afghan cave, billionaire engineer Tony Stark creates a unique weaponized suit of armor to fight evil.",
            "Jon Favreau","Robert Downey Jr., Gwyneth Paltrow, Terrence Howard, Jeff Bridges",R.drawable.ironman,R.drawable.ironman_detail,"8.1","2008 2h 06m", false),
        MovieDetail("Captain America","Superhero","As Steve Rogers struggles to embrace his role in the modern world, he teams up with a fellow Avenger and S.H.I.E.L.D agent, Black Widow, to battle a new threat from history: an assassin known as the Winter Soldier.",
            "Anthony Russo","Chris Evans, Samuel L. Jackson, Scarlett Johansson",R.drawable.camerica,R.drawable.camerica_detail,"8.0","2014 2h 16m", false),
        MovieDetail("Spiderman","Superhero","After Peter Parker is bitten by a genetically altered spider, he gains newfound, spider-like powers and ventures out to save the city from the machinations of a mysterious reptilian foe.",
            "Marc Webb"," Andrew Garfield, Emma Stone, Rhys Ifans",R.drawable.spiderman,R.drawable.spiderman_detail,"7.8","2012 2h 14m", false),
        MovieDetail("The Avengers","Superhero","Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity.",
            "Joss Whedon","",R.drawable.avengers,R.drawable.avengers_detail,"8.0","2012 2h 23m", false)
    )

    val fantasy = arrayListOf(
        MovieDetail("Titanic","Romance","A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.",
            "James Cameron","Leonardo DiCaprio, Kate Winslet, Billy Zane",R.drawable.titanic,R.drawable.titanic_detail,"8.1","1997 3h 14m", false),
        MovieDetail("Wall E","Romance","In the distant future, a small waste-collecting robot inadvertently embarks on a space journey that will ultimately decide the fate of mankind.",
            " Andrew Stanton","Ben Burtt, Elissa Knight, Jeff Garlin",R.drawable.walle,R.drawable.walle_detail,"8.4","2008 1h 38m", false),
        MovieDetail("Captain America","Superhero","As Steve Rogers struggles to embrace his role in the modern world, he teams up with a fellow Avenger and S.H.I.E.L.D agent, Black Widow, to battle a new threat from history: an assassin known as the Winter Soldier.",
            "Anthony Russo","Chris Evans, Samuel L. Jackson, Scarlett Johansson",R.drawable.camerica,R.drawable.camerica_detail,"8.0","2014 2h 16m", false),
        MovieDetail("Spiderman","Superhero","After Peter Parker is bitten by a genetically altered spider, he gains newfound, spider-like powers and ventures out to save the city from the machinations of a mysterious reptilian foe.",
            "Marc Webb"," Andrew Garfield, Emma Stone, Rhys Ifans",R.drawable.spiderman,R.drawable.spiderman_detail,"7.8","2012 2h 14m", false),
        MovieDetail("Star Wars","Sci-Fi","Luke Skywalker joins forces with a Jedi Knight, a cocky pilot, a Wookiee and two droids to save the galaxy from the Empire's world-destroying battle station, while also attempting to rescue Princess Leia from the mysterious Darth Vader.",
            "George Lucas","Mark Hamill, Harrison Ford, Carrie Fisher",R.drawable.interstellar,R.drawable.interstellar_detail,"8.6","1977 2h 1m", false)
    )

    val comedy = arrayListOf(
        MovieDetail("Back to the Future","Comedy","Marty McFly, a 17-year-old high school student, is accidentally sent thirty years into the past in a time-traveling DeLorean invented by his close friend, the eccentric scientist Doc Brown.",
            "Robert Zemeckis","Michael J. Fox, Christopher Lloyd, Lea Thompson",R.drawable.btf,R.drawable.btf_detail,"8.6","1985 1h 56m", true),
        MovieDetail("Guardians Of Galaxy","Comedy","A group of intergalactic criminals must pull together to stop a fanatical warrior with plans to purge the universe.",
            "James Gunn","Chris Pratt, Vin Diesel, Bradley Cooper ",R.drawable.gofg,R.drawable.gofg_detail,"8.0","2014 2h 1m", false),
        MovieDetail("Finding Nemo","Comedy","After his son is captured in the Great Barrier Reef and taken to Sydney, a timid clownfish sets out on a journey to bring him home.",
            " Andrew Stanton","",R.drawable.nemo, R.drawable.nemo_detail,"8.1","2003 1h 40m", false),
        MovieDetail("The Avengers","Comedy","Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity.",
            "Joss Whedon","Matthew McConaughey, Anne Hathaway, Jessica Chastain",R.drawable.avengers,R.drawable.avengers_detail,"8.0","2012 2h 23m", true),
        MovieDetail("Star Wars","Comedy","Luke Skywalker joins forces with a Jedi Knight, a cocky pilot, a Wookiee and two droids to save the galaxy from the Empire's world-destroying battle station, while also attempting to rescue Princess Leia from the mysterious Darth Vader.",
            "George Lucas","Mark Hamill, Harrison Ford, Carrie Fisher",R.drawable.interstellar,R.drawable.interstellar_detail,"8.6","1977 2h 1m", false)
    )

//    val comedy = arrayListOf(
//        MovieDetail("The Dark Knight","Superhero","When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.",
//            "Christopher Nolan","Christian Bale, Heath Ledger, Aaron Eckhart ",R.drawable.batman,R.drawable.batman_detail,"9.0","2008 2h 32m", false),
//        MovieDetail("Ironman","Superhero","After being held captive in an Afghan cave, billionaire engineer Tony Stark creates a unique weaponized suit of armor to fight evil.",
//            "Jon Favreau","Robert Downey Jr., Gwyneth Paltrow, Terrence Howard, Jeff Bridges",R.drawable.ironman,R.drawable.ironman_detail,"8.1","2008 2h 06m", false),
//        MovieDetail("Captain America","Superhero","As Steve Rogers struggles to embrace his role in the modern world, he teams up with a fellow Avenger and S.H.I.E.L.D agent, Black Widow, to battle a new threat from history: an assassin known as the Winter Soldier.",
//            "Anthony Russo","Chris Evans, Samuel L. Jackson, Scarlett Johansson",R.drawable.camerica,R.drawable.camerica_detail,"8.0","2014 2h 16m", false),
//        MovieDetail("Titanic","Romance","A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.",
//            "James Cameron","Leonardo DiCaprio, Kate Winslet, Billy Zane",R.drawable.titanic,R.drawable.titanic_detail,"8.1","1997 3h 14m", false),
//        MovieDetail("Wall E","Romance","In the distant future, a small waste-collecting robot inadvertently embarks on a space journey that will ultimately decide the fate of mankind.",
//            " Andrew Stanton","Ben Burtt, Elissa Knight, Jeff Garlin",R.drawable.walle,R.drawable.walle_detail,"8.4","2008 1h 38m", false)
//
//        )
    movieList[Genre.ACTION] = superHero
    movieList[Genre.SCIFI] = scifi
    movieList[Genre.ROMANCE] = romance
    movieList[Genre.HORROR] = horror
    movieList[Genre.FANTASY] = fantasy
    movieList[Genre.COMEDY] = comedy

    return movieList
}