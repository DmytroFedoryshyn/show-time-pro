package cinemaapp.spring.service;

import cinemaapp.spring.model.MovieSession;
import cinemaapp.spring.model.ShoppingCart;
import cinemaapp.spring.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
