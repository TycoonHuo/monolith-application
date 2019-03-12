package com.huo.login.demo.service.impl;

import com.huo.login.demo.dao.UserDao;
import com.huo.login.demo.dao.impl.UserDaoImpl;
import com.huo.login.demo.entity.User;
import com.huo.login.demo.service.UserService;

/**
 * @author huoguangyao
 * @date 2019/3/11 19:18
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    public String login(String loginId, String loginPwd) {
        User user = userDao.getUser(loginId, loginPwd);

        if (null == user) {
            return "fail";
        } else {
            return "ok";
        }
    }
}
