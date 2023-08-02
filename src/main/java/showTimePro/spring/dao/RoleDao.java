package showTimePro.spring.dao;

import showTimePro.spring.model.Role;

import java.util.Optional;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getByName(Role.RoleName roleName);
}
