package com.huo.login.demo.dao;

import com.huo.login.demo.entity.User;

/**
 * @author huoguangyao
 * @date 2019/3/11 19:12
 */
public interface UserDao {
    /**
     * 获取用户
     * @param loginId
     * @param loginPwd
     * @return User 返回登陆对象
     */
    public User getUser(String loginId,String loginPwd);
}
