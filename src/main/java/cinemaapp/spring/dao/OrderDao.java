package cinemaapp.spring.dao;

import cinemaapp.spring.model.Order;
import cinemaapp.spring.model.User;

import java.util.List;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
