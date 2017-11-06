package com.pet.shop.mapper;

import com.pet.shop.model.UserRole;
import com.pet.shop.util.MyMapper;

import java.util.List;

public interface UserRoleMapper extends MyMapper<UserRole> {
    public List<Integer> findUserIdByRoleId(Integer roleId);
}