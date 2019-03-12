package com.huo.login.demo.dao.impl;

import com.huo.login.demo.dao.UserDao;
import com.huo.login.demo.entity.User;

/**
 * @author huoguangyao
 * @date 2019/3/11 19:14
 */
public class UserDaoImpl implements UserDao {

    private String admin = "admin";
    public User user;
    @Override
    public User getUser(String loginId, String loginPwd) {
        if(admin.equals(loginId)){
            System.out.println("用户存在");
            if(admin.equals(loginPwd)){
                user = new User();
                user.setLoginId("admin");
                user.setLoginPwd("admin");
            }
        }

        return user;
    }
}
