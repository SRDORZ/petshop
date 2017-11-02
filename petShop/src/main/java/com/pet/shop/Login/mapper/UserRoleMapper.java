package com.pet.shop.Login.mapper;

import com.pet.shop.Login.model.UserRole;
import com.pet.shop.utils.MyMapper;

import java.util.List;

public interface UserRoleMapper extends MyMapper<UserRole> {
    public List<Integer> findUserIdByRoleId(Integer roleId);
}