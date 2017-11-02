package com.pet.shop.login.mapper;

import com.pet.shop.login.model.UserRole;
import com.pet.shop.utils.MyMapper;

import java.util.List;

public interface UserRoleMapper extends MyMapper<UserRole> {
    public List<Integer> findUserIdByRoleId(Integer roleId);
}