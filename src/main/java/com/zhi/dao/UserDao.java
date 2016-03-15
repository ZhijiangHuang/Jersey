package com.zhi.dao;

import com.zhi.entity.User;

/**
 * Created by HUANGZHIJIANG416 on 2016/3/15.
 */
public interface UserDao {
    User selectUserById(int id);
}
