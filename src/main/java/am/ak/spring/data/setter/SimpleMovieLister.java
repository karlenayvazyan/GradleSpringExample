package am.ak.spring.data.setter;

import am.ak.spring.data.canstuctor.MovieFinder;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by karlen on 3/16/17.
 */
public class SimpleMovieLister {

    private MovieFinder movieFinder;

    @Required
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public MovieFinder getMovieFinder() {
        return movieFinder;
    }
}
