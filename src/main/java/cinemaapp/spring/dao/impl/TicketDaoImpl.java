package cinemaapp.spring.dao.impl;

import cinemaapp.spring.dao.TicketDao;
import cinemaapp.spring.model.Ticket;
import cinemaapp.spring.dao.AbstractDao;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
