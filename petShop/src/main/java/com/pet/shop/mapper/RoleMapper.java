package com.pet.shop.mapper;

import com.pet.shop.model.Role;
import com.pet.shop.util.MyMapper;

import java.util.List;

public interface RoleMapper extends MyMapper<Role> {
    public List<Role> queryRoleListWithSelected(Integer id);
}