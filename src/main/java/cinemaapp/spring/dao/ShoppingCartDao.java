package cinemaapp.spring.dao;

import cinemaapp.spring.model.ShoppingCart;
import cinemaapp.spring.model.User;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart shoppingCart);

    ShoppingCart getByUser(User user);

    ShoppingCart update(ShoppingCart shoppingCart);
}
