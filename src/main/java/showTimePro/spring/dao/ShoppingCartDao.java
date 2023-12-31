package showTimePro.spring.dao;

import showTimePro.spring.model.ShoppingCart;
import showTimePro.spring.model.User;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart shoppingCart);

    ShoppingCart getByUser(User user);

    ShoppingCart update(ShoppingCart shoppingCart);
}
