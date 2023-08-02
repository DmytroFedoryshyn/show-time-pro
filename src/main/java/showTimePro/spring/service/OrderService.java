package showTimePro.spring.service;

import showTimePro.spring.model.Order;
import showTimePro.spring.model.ShoppingCart;
import showTimePro.spring.model.User;

import java.util.List;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
