package showTimePro.spring.service.impl;

import showTimePro.spring.model.Role;
import showTimePro.spring.model.User;
import showTimePro.spring.service.AuthenticationService;
import showTimePro.spring.service.RoleService;
import showTimePro.spring.service.ShoppingCartService;
import showTimePro.spring.service.UserService;
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
