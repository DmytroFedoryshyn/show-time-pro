package cinemaapp.spring.service;

import cinemaapp.spring.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByName(String roleName);
}
