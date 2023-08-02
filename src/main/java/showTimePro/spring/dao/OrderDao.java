package showTimePro.spring.dao;

import showTimePro.spring.model.Order;
import showTimePro.spring.model.User;

import java.util.List;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
