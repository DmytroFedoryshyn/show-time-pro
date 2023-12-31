package showTimePro.spring.dao.impl;

import showTimePro.spring.dao.AbstractDao;
import showTimePro.spring.dao.CinemaHallDao;
import showTimePro.spring.model.CinemaHall;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CinemaHallDaoImpl extends AbstractDao<CinemaHall> implements CinemaHallDao {
    public CinemaHallDaoImpl(SessionFactory factory) {
        super(factory, CinemaHall.class);
    }
}
