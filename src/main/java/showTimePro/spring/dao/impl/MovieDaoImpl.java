package showTimePro.spring.dao.impl;

import showTimePro.spring.dao.AbstractDao;
import showTimePro.spring.dao.MovieDao;
import showTimePro.spring.model.Movie;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
