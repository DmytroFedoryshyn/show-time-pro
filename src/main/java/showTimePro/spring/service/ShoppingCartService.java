package showTimePro.spring.service;

import showTimePro.spring.model.MovieSession;
import showTimePro.spring.model.ShoppingCart;
import showTimePro.spring.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
