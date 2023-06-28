package cinemaapp.spring.service.impl;

import cinemaapp.spring.dao.RoleDao;
import cinemaapp.spring.exception.DataProcessingException;
import cinemaapp.spring.model.Role;
import cinemaapp.spring.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role getByName(String roleName) {
        Optional<Role> roleOptional = roleDao.getByName(Role.RoleName.valueOf(roleName));
        if (roleOptional.isEmpty()) {
            throw new DataProcessingException("Role with name " + roleName + " not found", null);
        }

        return roleOptional.get();
    }
}