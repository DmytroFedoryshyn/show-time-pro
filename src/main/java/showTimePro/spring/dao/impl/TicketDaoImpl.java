package showTimePro.spring.dao.impl;

import showTimePro.spring.dao.TicketDao;
import showTimePro.spring.model.Ticket;
import showTimePro.spring.dao.AbstractDao;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
