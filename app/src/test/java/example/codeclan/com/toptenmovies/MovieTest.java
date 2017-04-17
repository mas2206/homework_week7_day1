package example.codeclan.com.toptenmovies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 17/04/2017.
 */

public class MovieTest {

    Movie movie;

    @Before
    public void before(){
        this.movie = new Movie("Goodfellas", "Crime", 4);
    }

    @Test
    public void movieHasTitle(){
        String title = this.movie.getTitle();
        assertEquals("Goodfellas", title);
    }

    @Test
    public void movieHasGenre(){
        String genre = this.movie.getGenre();
        assertEquals("Crime", genre);
    }

    @Test
    public void movieHasRanking(){
        int ranking = this.movie.getRanking();
        assertEquals(4, ranking);
    }

    @Test
    public void movieTitleCanBeSet(){
        movie.setTitle("Alien");
        assertEquals("Alien", movie.title);
    }

    @Test
    public void movieGenreCanBeSet(){
        movie.setGenre("Comedy");
        assertEquals("Comedy", movie.genre);
    }

    @Test
    public void movieRankingCanBeSet(){
        movie.setRanking(8);
        assertEquals(8, movie.ranking);
    }

    @Test
    public void movieDetailsCanBeListedInOneString(){
        assertEquals("Title: Goodfellas, Genre: Crime, Ranking: 4", movie.toString());
    }

}
