package cinemaapp.spring.service.impl;

import cinemaapp.spring.model.Role;
import cinemaapp.spring.model.User;
import cinemaapp.spring.service.AuthenticationService;
import cinemaapp.spring.service.RoleService;
import cinemaapp.spring.service.ShoppingCartService;
import cinemaapp.spring.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final ShoppingCartService shoppingCartService;
    private final RoleService roleService;

    public AuthenticationServiceImpl(UserService userService,
                                     ShoppingCartService shoppingCartService,
                                     RoleService roleService) {
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
        this.roleService = roleService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        Set<Role> roles = Set.of(roleService.getByName("USER"));
        user.setRoles(roles);
        userService.add(user);
        shoppingCartService.registerNewShoppingCart(user);
        return user;
    }
}
