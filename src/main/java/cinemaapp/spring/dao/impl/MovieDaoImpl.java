package cinemaapp.spring.dao.impl;

import cinemaapp.spring.dao.AbstractDao;
import cinemaapp.spring.dao.MovieDao;
import cinemaapp.spring.model.Movie;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
