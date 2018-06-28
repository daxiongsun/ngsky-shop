package com.ngsky.mapper;

import com.ngsky.bean.User;
import com.ngsky.bean.UserExample;

/**
 * UserDAO继承基类
 */
public interface UserDAO extends MyBatisBaseDao<User, Long, UserExample> {
}