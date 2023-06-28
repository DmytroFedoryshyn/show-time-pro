package cinemaapp.spring.dao;

import cinemaapp.spring.model.Role;

import java.util.Optional;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getByName(Role.RoleName roleName);
}
