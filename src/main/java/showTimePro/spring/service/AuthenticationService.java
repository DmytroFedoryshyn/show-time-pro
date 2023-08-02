package showTimePro.spring.service;

import showTimePro.spring.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
