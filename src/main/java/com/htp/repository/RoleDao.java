package com.htp.repository;

import com.htp.domain.Role;
import com.htp.domain.User;

import java.util.List;

public interface RoleDao extends GenericDao<Role, Long> {
    List<Role> getRolesByUserId(Long userId);
}
