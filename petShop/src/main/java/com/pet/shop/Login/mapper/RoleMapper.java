package com.pet.shop.login.mapper;

import com.pet.shop.login.model.Role;
import com.pet.shop.utils.MyMapper;

import java.util.List;

public interface RoleMapper extends MyMapper<Role> {
    public List<Role> queryRoleListWithSelected(Integer id);
}