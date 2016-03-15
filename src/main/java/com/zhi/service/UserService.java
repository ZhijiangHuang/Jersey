package com.zhi.service;

import com.zhi.dao.UserDao;
import com.zhi.entity.User;

/**
 * Created by HUANGZHIJIANG416 on 2016/3/15.
 */
public class UserService {
    private UserDao userDao;
    public User getUser(int id){
        User user = userDao.selectUserById(id);
        System.out.println(user);
        return user;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
