package showTimePro.spring.dao;

import showTimePro.spring.model.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);

    List<Movie> getAll();
}
