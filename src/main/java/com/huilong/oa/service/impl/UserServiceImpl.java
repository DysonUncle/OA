package com.huilong.oa.service.impl;

import com.huilong.oa.dao.UserDao;
import com.huilong.oa.entity.UserEntity;
import com.huilong.oa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
public class UserServiceImpl implements UserService {
@Autowired
private UserDao userDao;
    @Override
    @Transactional(rollbackFor = {Exception.class,RuntimeException.class})
    public void save(UserEntity userEntity) {
        userDao.save(userEntity);
    }
}
