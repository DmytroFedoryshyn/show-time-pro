package cinemaapp.spring.service;

import cinemaapp.spring.model.Order;
import cinemaapp.spring.model.ShoppingCart;
import cinemaapp.spring.model.User;

import java.util.List;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
