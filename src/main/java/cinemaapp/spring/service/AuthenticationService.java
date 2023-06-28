package cinemaapp.spring.service;

import cinemaapp.spring.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
