package showTimePro.spring.service;

import showTimePro.spring.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByName(String roleName);
}
