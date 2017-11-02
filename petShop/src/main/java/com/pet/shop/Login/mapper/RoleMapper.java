package com.pet.shop.Login.mapper;

import com.pet.shop.Login.model.Role;
import com.pet.shop.utils.MyMapper;

import java.util.List;

public interface RoleMapper extends MyMapper<Role> {
    public List<Role> queryRoleListWithSelected(Integer id);
}