package showTimePro.spring.service.impl;

import showTimePro.spring.dao.MovieDao;
import showTimePro.spring.model.Movie;
import showTimePro.spring.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieDao movieDao;

    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElseThrow(
                () -> new RuntimeException("Can't get movie by id " + id));
    }

    @Override
    public List<Movie> getAll() {
        return movieDao.getAll();
    }
}
