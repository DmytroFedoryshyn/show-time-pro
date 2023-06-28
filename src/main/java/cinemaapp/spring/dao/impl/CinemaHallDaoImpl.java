package cinemaapp.spring.dao.impl;

import cinemaapp.spring.dao.AbstractDao;
import cinemaapp.spring.dao.CinemaHallDao;
import cinemaapp.spring.model.CinemaHall;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CinemaHallDaoImpl extends AbstractDao<CinemaHall> implements CinemaHallDao {
    public CinemaHallDaoImpl(SessionFactory factory) {
        super(factory, CinemaHall.class);
    }
}
