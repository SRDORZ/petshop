package com.pet.shop.service;

import com.github.pagehelper.PageInfo;
import com.pet.shop.model.User;

/**
 * Created by zhujr on 2017/11/02.
 */
public interface UserService extends IService<User>{
    PageInfo<User> selectByPage(User user, int start, int length);

    User selectByUsername(String username);

    void delUser(Integer userid);

}
